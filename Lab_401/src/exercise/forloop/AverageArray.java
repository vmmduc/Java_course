package exercise.forloop;

public class AverageArray {

	public static void main(String[] args) {
		int [] intArray = {12, 5, 9, 8, 11, 86};
		int sum = 0;
		double average = 0.0d;
		for (int i = 0; i< intArray.length; i++) {
			sum += intArray[i];
		}
		average = sum/intArray.length;
		System.out.println("Average of all element in intArray: " + average);;
	}

}
