package fa.training.assignment1;

import java.util.Scanner;

public class LogicalExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2;
		Scanner scan = new Scanner(System.in);
		System.out.print("x = ");
		n1 = scan.nextInt();
		System.out.print("y = ");
		n2 = scan.nextInt();
		
		if(n1 != n2) {
			System.out.println(n1 + " != " + n2);
			if(n1 < n2) {
				System.out.println(n1 + " < " + n2);
			} else {
				System.out.println(n1 + " > " + n2);
			}
		} else {
			System.out.println(n1 + " = " + n2);
		}
	}
}
