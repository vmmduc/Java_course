package Exercise_2;

import java.util.Scanner;

public class HourlyEmployee extends Employee{
	double rate;
	double workingHours;

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + rate + "\t" + workingHours;
	}
	
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input rate: ");
		rate = sc.nextDouble();
		System.out.println("Input working hours: ");
		rate = sc.nextDouble();
	}
}
