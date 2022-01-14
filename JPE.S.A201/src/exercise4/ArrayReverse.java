package exercise4;

public class ArrayReverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myIntArray = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };
		int temp;
		for(int i = 0; i< myIntArray.length; i++)
			System.out.print(myIntArray[i] + " ");
		for(int i = 0; i< myIntArray.length/2; i++) {
			temp = myIntArray[i];
			myIntArray[i] = myIntArray[myIntArray.length-i-1];
			myIntArray[myIntArray.length-i-1] = temp;
		}
		System.out.println("\n");
		for(int i = 0; i< myIntArray.length; i++)
			System.out.print(myIntArray[i] + " ");
	}

}
