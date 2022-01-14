package exercise.ifelse;

import java.util.Scanner;

public class CheckOldEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter value for number: ");
		int number = scan.nextInt();
		
		System.out.println("The number is " + number);
		if(number % 2 == 0) {
			System.out.println("Even Number");
		}
		else System.out.println("Old Number");
		
		System.out.println("---------------\n Bye");
		scan.close();
	}

}
