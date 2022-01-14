package Exercise_3;

public class Sedan extends Car{
	int length;
	
	public Sedan(int speed, double regularPrice, String Color, int length) {
		super(speed, regularPrice, Color);
		this.length = length;
	}
	
	public double getSalePrice() {
		return this.length > 20 ? 
				(regularPrice - regularPrice*0.05) 
				: 
				(regularPrice - regularPrice*0.1);
	}
}
