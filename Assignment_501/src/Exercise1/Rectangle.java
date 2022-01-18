package Exercise1;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getPerimeter() {
		return (this.width + this.length)*2;
	}
	
	public double getArea() {
		return this.width * this.length;
	}
	public void printResult() {
		System.out.print("-----Rectangle-----");
		System.out.printf("\nWidth: %.1f", width);
		System.out.printf("\nLength: %.1f", length);
		System.out.printf("\nArea: %.1f", getArea());
		System.out.printf("\nPerimeter: %.1f", getPerimeter());
	}
}
