package fa.training.assignment1;

import java.util.Scanner;

public class ArithmeticExercise2 {

	public static void main(String[] args) {
		int x,y;
		Scanner scan = new Scanner(System.in);
		System.out.print("x = ");
		x = scan.nextInt();
		System.out.print("y = ");
		y = scan.nextInt();
		System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " x " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " % " + y + " = " + (x % y));
        scan.close();
	}

}
