package Exercise2;

public class Person {
	private Wallet wallet;
	
	public Person() {
		wallet = new Wallet();
	}
	
	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	public int calcTotal(int[] bills) {
		int total = 0;
		for(int i = 0; i < bills.length; i++) {
			total += bills[i];
		}
		return total;
	}
}
