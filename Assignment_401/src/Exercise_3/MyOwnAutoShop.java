package Exercise_3;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Sedan s = new Sedan(200, 10000, "Black", 3);
		Ford f = new Ford(200, 12000, "Black", 2020, 9000);
		Car c = new Car(200, 10000, "Black");
		
		System.out.println("The sale prices of Sedan: " + s.getSalePrice());
		System.out.println("The sale prices of Ford: " + f.getSalePrice());
		System.out.println("The sale prices of Car: " + c.getSalePrice());
	}

}
