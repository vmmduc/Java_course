package Exercise1;

public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getPerimeter() {return 2*Math.PI*radius;}
	public double getArea() { return Math.PI*radius*radius;}
	public void printResult() {
		System.out.print("\n-----Circle-----");
		System.out.printf("\nRadius: %.1f", radius);
		System.out.printf("\nArea: %.1f", getArea());
		System.out.printf("\nPerimeter: %.1f", getPerimeter());
	}
}
