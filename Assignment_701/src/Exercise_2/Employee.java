package Exercise_2;

import java.util.Scanner;

import Exercise_2.utils.*;

public abstract class Employee {
	String ssn;
	String firstName;
	String lastName;
	String birthDate;
	String phone;
	String email;

	public Employee(String ssn, String firstName, String lastName, String birthDate, String phone, String email) {
		super();
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
	}

	public Employee() {

	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return ssn + "\t" + firstName + "\t" + lastName + "\t" + birthDate + "\t" + phone + "\t" + email + "\t";
	}

	public void display() {
		System.out.println(this);
	}

	public void input() {
		RegexString reg = new RegexString();
		Scanner sc = new Scanner(System.in);

		System.out.println("Input ssn : ");
		ssn = sc.next();
		System.out.println("Input first Name : ");
		firstName = sc.next();
		System.out.println("Input last Name : ");
		lastName = sc.next();
		System.out.println("Input birth date : ");
		birthDate = sc.next();

		while (true) {
			System.out.print("Input phone number: ");
			phone = sc.nextLine();

			if (reg.checkPhone(phone) == null)
				System.out.println("Number phone must is correct format");
			else {
				System.out.println("Phone number: " + phone);
				break;
			}
		}

		while (true) {
			System.out.print("Inpu email: ");
			email = sc.nextLine();
			if (reg.checkEmail(email) == null)
				System.out.println("Email must is correct format");
			else {
				System.out.println("Email: " + email);
				break;
			}
		}
	}
}
