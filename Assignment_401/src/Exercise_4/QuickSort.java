package Exercise_4;

public class QuickSort extends NumberList implements Sort {

	public QuickSort(int n) {
		super(n);
	}
	@Override
	public void sort(int L, int R) {
		if( L >= R) return;
		int temp;
		temp = a[L];
		a[L] = a[(L+R)/2];
		a[(L+R)/2] = temp;
		
		int i = L;
		for(int j = L + 1; j <= R; j++) {
			if(a[j] < a[L]){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		temp = a[L];
		a[L] = a[i];
		a[i] = temp;	

		sort(L, i - 1);
		sort(i + 1, R);
	}	
}
