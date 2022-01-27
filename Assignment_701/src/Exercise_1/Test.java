package Exercise_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		RegexString reg = new RegexString();
		String email, phone, date;
		Scanner scan = new Scanner(System.in);
		// Check phone
		while (true) {
			System.out.print("Phone number: ");
			phone = scan.nextLine();

			if (reg.checkPhone(phone) == null)
				System.out.println("Number phone must is correct format");
			else {
				System.out.println("Phone number: " + phone);
				break;
			}
		}
		// Check Email
		while (true) {
			System.out.print("Email: ");
			email = scan.nextLine();
			if (reg.checkEmail(email) == null)
				System.out.println("Email must is correct format");
			else {
				System.out.println("Email: " + email);
				break;
			}
		}
		// Check date
		while (true) {
			System.out.print("Date: ");
			date = scan.nextLine();
			if (reg.checkEmail(date) == null)
				System.out.println("Date must is correct format");
			else {
				System.out.println("Date: " + date);
				break;
			}
		}
	}
}
