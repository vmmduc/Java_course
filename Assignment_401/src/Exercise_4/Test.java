package Exercise_4;
/*
 * Quick Sort: sort(0, n-1)
 * Otherwise: sort(1, n)
 * */
public class Test {

	public static void main(String[] args) {
		SelectionSort q = new SelectionSort(5);
		q.input();
		q.print();
		q.sort(1, 5);
		System.out.println("\nArray after sort: ");
		q.print();
	}
}
