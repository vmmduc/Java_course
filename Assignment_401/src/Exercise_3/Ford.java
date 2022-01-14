package Exercise_3;

public class Ford extends Car{
	int year;
	int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String Color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, Color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	double getSalePrice() {
		return (regularPrice - manufacturerDiscount);
	}
}
