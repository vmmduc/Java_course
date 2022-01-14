package Exercise_4;

public class InsertSort extends NumberList implements Sort{

	public InsertSort(int n) {
		super(n);
	}

	@Override
	public void sort(int L, int R) {
		for(int i = L; i < R; i++) {
			int x = a[i];
			int j = i - 1;
			
			while (j >= 0 && a[j] > x) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = x;
		}
	}
	
}
