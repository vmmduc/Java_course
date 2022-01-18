package fa.training.entities;

import java.util.Scanner;

import fa.training.utils.Validator;

public class Employee {
	private int id;
	private String name;
	private byte gender;
	private String email;
	private String address;
	private double salary;
	
	public Employee() {
	}

	public Employee(int id, String name, byte gender, String email, String address, double salary) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getGender() {
		return gender;
	}

	public void setGender(byte gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.gender + " " + 
					this.email + " " + this.address + " " + this.salary;
	}
	
	@SuppressWarnings("resource")
	public void input() {
		Scanner scan = new Scanner(System.in);
		boolean status;
		
		// Enter id
		do {
			status = false;
			System.out.println("Enter id (number): ");
			try {
				id = Integer.parseInt(scan.nextLine());
			}
			catch (Exception e) {
				status = true;
			}
		} while(status);
		
		// Enter name
		System.out.println("Name");
		name = scan.nextLine();
		
		// Enter gender
		do {
			status = false;
			System.out.println("Gender (1: male, 0: female): ");
			try {
				gender = Byte.parseByte(scan.nextLine());
				status = !(Validator.isGender(gender));
			}
			catch (Exception e) {
				status = true;
			}
		} while(status);
		
		// Enter email
		do {
			status = false;
			System.out.println("Email: ");
			try {
				email = scan.nextLine();
				status = !Validator.isEmail(email);
			}catch (Exception e) {
				status = true;
			}
			
		} while (status);
		
		// Enter address
		System.out.println("Address: ");
		address = scan.nextLine();
		
		// Enter salary
		System.out.println("Salary: ");
		salary = Double.parseDouble(scan.nextLine());
	}
}
