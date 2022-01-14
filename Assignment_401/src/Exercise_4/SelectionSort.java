package Exercise_4;

public class SelectionSort extends NumberList implements Sort{

	SelectionSort(int n){
		super(n);
	}
	@Override
	public void sort(int L, int R) {
		for(int i = L; i < R; i++) {
			int min = i;
			for(int j = i+1; j < R; j++)
				if(a[j] < a[min])
					min = j;
			
			// swap
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
}
