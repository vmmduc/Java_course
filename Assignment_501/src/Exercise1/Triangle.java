package Exercise1;

public class Triangle extends Shape {
	private double sideA;
	private double sideB;
	private double sideC;

	
	public Triangle() {
		super();
	}

	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double getPerimeter() {
		return sideA + sideB + sideC;
	}

	public double getArea() {
		double p = (sideA + sideB + sideC) / 2;
		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}

	public void printResult() {
		System.out.print("\n-----Triangle-----");
		System.out.printf("\nWidth: %.1f", sideA);
		System.out.printf("\nWidth: %.1f", sideB);
		System.out.printf("\nWidth: %.1f", sideC);
		System.out.printf("\nArea: %.1f", getArea());
		System.out.printf("\nPerimeter: %.1f", getPerimeter());
	}
}
