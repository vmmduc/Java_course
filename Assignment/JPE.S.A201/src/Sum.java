import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, n4, n5;
		Scanner s = new Scanner(System.in);
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3 = s.nextInt();
		n4 = s.nextInt();
		n5 = s.nextInt();
		
		System.out.println("Input first number: " + n1);
		System.out.println("Input second number: " + n2);
		System.out.println("Input third number: " + n3);
		System.out.println("Input fourth number: " + n4);
		System.out.println("Input fourth number: " + n5);
		System.out.println("The sum is " + (n1+n2+n3+n4+n5));
	}

}
