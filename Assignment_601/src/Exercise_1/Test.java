package Exercise_1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		run();
	}
	
	public static void menu() {
		System.out.println("=========== Caculator program ===========");
		System.out.println("1. Normal Caculator");
		System.out.println("2. BMI Caculator");
		System.out.println("3. Exit");
		System.out.print("Please choice one option: ");
	}
	
	public static int choice() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		return n;
	}
	
	public static void run() {
		Calculator calculator = new Calculator();
		int option;
		do {
			menu();
			option = choice();

			switch(option) {
				case 1:
					calculator.normalCaculator();
					break;
				case 2:
					calculator.BMICaculator();
					break;
				case 3:
					System.exit(0);
					break;
			}
				
		}while (option != 3);
	}
}
