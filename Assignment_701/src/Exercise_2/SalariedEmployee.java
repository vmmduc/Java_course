package Exercise_2;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	double commisstionRate;
	double grossSales;
	double basicSalary;

	public double getCommisstionRate() {
		return commisstionRate;
	}

	public void setCommisstionRate(double commisstionRate) {
		this.commisstionRate = commisstionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public SalariedEmployee() {
		super();

	}

	public SalariedEmployee(String ssn, String firstName, String lateName, String birthDate, String phone, String email,
			double commisstionRate, double grossSales, double basicSalary) {
		super(ssn, firstName, lateName, birthDate, phone, email);
		this.commisstionRate = commisstionRate;
		this.grossSales = grossSales;
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + commisstionRate + "\t" + grossSales + "\t" + basicSalary;
	}

	@Override
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input commisstionrate : ");
		commisstionRate = sc.nextDouble();
		System.out.println("Input grosssales : ");
		grossSales = sc.nextDouble();
		System.out.println("Input bassicsalary : ");
		basicSalary = sc.nextDouble();
	}

}
