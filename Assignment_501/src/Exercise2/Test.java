package Exercise2;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("====== Shopping program ======");
		Person person  = new Person();
		Scanner scanner = new Scanner(System.in);
		System.out.print("input number of bill: ");
		int n = scanner.nextInt();
		
		int[] bills = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("input value of bill " + (i + 1) + ":");
			bills[i] = scanner.nextInt();
		}
		System.out.print("input value of wallet: ");
		person.getWallet().setMonney(scanner.nextInt());
		int total = person.calcTotal(bills);
		System.out.println("this is total of bill: "+ total);
		if(person.getWallet().payMoney(total)) {
			System.out.println("You can buy it.");
		}
		else System.out.println("You can't buy it.");
	}

}
