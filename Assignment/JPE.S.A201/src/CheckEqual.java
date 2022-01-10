import java.util.Scanner;

public class CheckEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, n4;
		Scanner s = new Scanner(System.in);
		n1 = s.nextInt();
		n2 = s.nextInt();
		n3 = s.nextInt();
		n4 = s.nextInt();
		
		System.out.println("Input first number: " + n1);
		System.out.println("Input second number: " + n2);
		System.out.println("Input third number: " + n3);
		System.out.println("Input fourth number: " + n4);
		
		if(n1 == n2 && n2 == n3 && n3 == n4) {
			System.out.println("All four are equal!");
		}
		else System.out.println("Numbers are not equal!");
		s.close();
	}

}
