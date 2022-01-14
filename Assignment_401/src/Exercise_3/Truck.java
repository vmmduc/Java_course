package Exercise_3;

public class Truck extends Car{
	int weight;
	
	public Truck(int speed, double regularPrice, String Color, int weight) {
		super(speed,regularPrice,Color);
		this.weight = weight;
	}
	
	double getSalePrice() {
		return weight > 2000 ?
			regularPrice - regularPrice*0.1
			:
			regularPrice - regularPrice*0.2;
		
	}
}
