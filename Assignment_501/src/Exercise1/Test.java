package Exercise1;

import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("=====Calculator Shape Progarmer=====");
		
		System.out.println("Please input side width of Rectange:");
		rectangle.setWidth(scanner.nextDouble());
		System.out.println("Please input side length of Rectange:");
		rectangle.setLength(scanner.nextDouble());
		
		System.out.println("Please input radius of Circle:");
		circle.setRadius(scanner.nextDouble());
		
		System.out.println("Please input side A of Triangle:");
		triangle.setSideA(scanner.nextDouble());
		System.out.println("Please input side B of Triangle:");
		triangle.setSideB(scanner.nextDouble());
		System.out.println("Please input side C of Triangle:");
		triangle.setSideC(scanner.nextDouble());
		
		rectangle.printResult();
		circle.printResult();
		triangle.printResult();
		
	}

}
