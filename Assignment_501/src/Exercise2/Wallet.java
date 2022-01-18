package Exercise2;

public class Wallet {
	private int Monney;
	
	public Wallet() {
		super();
	}

	public Wallet(int monney) {
		super();
		Monney = monney;
	}
	
	public int getMonney() {
		return Monney;
	}

	public void setMonney(int monney) {
		Monney = monney;
	}

	public boolean payMoney(int total) {
		return Monney > total ? true : false;
	}
}
