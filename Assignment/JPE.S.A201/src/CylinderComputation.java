import java.util.Scanner;

public class CylinderComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, height, surfaceArea, baseArea, volume;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter radius: ");
		radius = s.nextDouble();
		System.out.print("Enter height: ");
		height = s.nextDouble();
		
		baseArea = 2*Math.PI*radius*height;
		surfaceArea = 2*Math.PI*Math.PI + baseArea;
		volume = Math.PI*radius*radius*height;
		
		System.out.println("Surface area = " + surfaceArea);
		System.out.println("Base area = " + baseArea);
		System.out.println("Volume = " + volume);
		s.close();
	}

}
