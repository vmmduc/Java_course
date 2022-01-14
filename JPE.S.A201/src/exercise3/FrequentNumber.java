package exercise3;

import java.util.Scanner;

public class FrequentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, len = 5;
		int[] a = new int[len];
		Scanner s = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		 do{
			System.out.print("Do you want to continue?(y/n)");
			String next = scan.nextLine();
			if(next.equals("y")) {
				System.out.print("a[" + i + "] = ");
				a[i] = s.nextInt();
				i++;
			}
			else break;
		}while(i < len);
		int value = 5, count = 0;
		for(int j = 0; j < len; j++) {
			System.out.print(a[j] + " ");
			if(a[j] == value) count++;
		}
		System.out.println("Amount of frequence: " + count);
	}
}
