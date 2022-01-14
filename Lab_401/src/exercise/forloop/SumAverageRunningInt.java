package exercise.forloop;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		int low = 1;
		int up = 100;
		
		int sum = 0;
		double average;
		
		for(int i = low; i <= up; i++) {
			sum += i;
		}
		
		average = sum / up;
		
		System.out.println("Average of all 100 first number: " + average);;
	}

}
