package exercise.forloop;

public class Fibonaci {

	public static void main(String[] args) {
		int n = 1;
		int fnMin1 = 1;
		int fnMin2 = 1;
		int nMax = 20;
		int sum = fnMin1 + fnMin2;
		double average;
		
		System.out.println("The fist " + nMax + "fibonaci number are: ");
		
		while (n <= 20) {
			System.out.print(fnMin1 + " ");
			
			sum = fnMin1 + fnMin2;
			
			fnMin1 = fnMin2;
			fnMin2 = sum;
			n++;
		}

		average = sum / nMax;
		System.out.println("\n The average is " + average);;
	}

}
