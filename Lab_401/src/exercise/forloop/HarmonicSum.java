package exercise.forloop;

public class HarmonicSum {
	public static void main(String[] args) {
		int n = 50000;
		double sumL2R = printLeftToRightSum(n);
		double sumR2L = printRightToLeftSum(n);
		
		System.out.printf("Difference: %.15f \n", (sumL2R - sumR2L));
	}
	private static double printLeftToRightSum(int n) {
		double sum = 0.0;
		for(int i=1; i<=n; i++) sum+= (double) 1/i;
		System.out.printf("Left to Right harmonic sum %.15f \n", sum);
		return sum;
	}
	
	private static double printRightToLeftSum(int n) {
		double sum = 0.0;
		for(int i = n; i>= 1;i--) sum += (double) 1/i;
		System.out.printf("Right to left harmonic sum %.15f \n", sum);
		return sum;
	}
}
