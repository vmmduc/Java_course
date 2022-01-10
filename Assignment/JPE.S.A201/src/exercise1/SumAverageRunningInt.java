package exercise1;

import java.util.Scanner;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lowerbound = 1, uppebound = 100, sum = 0;
		for(int i=lowerbound; i <= uppebound;i++) {
			sum += i;
		}
		double average = sum/uppebound;
		System.out.println("Average of all" + uppebound +" first numbers: " + average);
	}

}
