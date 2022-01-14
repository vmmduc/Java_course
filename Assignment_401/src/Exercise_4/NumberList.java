package Exercise_4;

import java.util.Scanner;

public class NumberList {
	int[] a;
	public NumberList(int n) {
		a = new int[n];
	}
	public void input() {
		System.out.println("Enter element:");
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = " );
			a[i] = s.nextInt();
		}
		s.close();
	}
	public void print() {
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
