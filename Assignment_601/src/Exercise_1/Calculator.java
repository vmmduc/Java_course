package Exercise_1;

import java.util.Scanner;

public class Calculator {
	
	private Operator checkOperator(String operator) {
		if(operator.equals("+")) return Operator.Addition;
		if(operator.equals("-")) return Operator.Subtraction;
		if(operator.equals("*")) return Operator.Multilplication;
		if(operator.equals("/")) return Operator.Division;
		if(operator.equals("^")) return Operator.Power;
		if(operator.equals("=")) return Operator.Equal;
		else return null;
	}
	
	private static Double checkIn(String inputVal) {
		Double res = null;
		if(inputVal == null || inputVal.equals("")) return res;
		else 
			try {
				res = Double.parseDouble(inputVal);
			} catch (Exception e) {
				//throw new NumberFormatException();
				return null;
			}
		return res;
	}
	
	private double calulation(double a, Operator o, double b) {
		double res = 0;
		switch (o) {
		case Addition: {
			res = a + b;
			break;
		}
		case Subtraction: {
			res = a - b;
			break;
		}
		case Multilplication: {
			res = a * b;
			break;
		}
		case Division: {
			try {
				res = a / b;
			} catch (ArithmeticException e){
				System.out.println(e);
			}
			break;
		}
		case Power: {
			res = Math.pow(a, b);
			break;
		}
		default:
			throw new AssertionError();
		}
		
		return res;
	}
	
	private BMI BMIcalculation(double weight, double height) {
		
		height /= 100;
		double bmi = weight /(height* height);
		
		if(bmi < 19) return BMI.Thin;
		if(bmi >= 19 && bmi < 25) return BMI.Normal;
		if(bmi >= 25 && bmi < 30) return BMI.OverWeight;
		if(bmi >= 30 && bmi < 40) return BMI.Fat;
		else return BMI.VeryFat;
		
	}
	
	public void normalCaculator() {
		Double Memory,b;
		Operator o;
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Enter number: ");
			String strA = scan.next();
			Memory = checkIn(strA);
		}while(Memory == null);
		
		while(true) {
			do {
				System.out.println("Enter operator: ");
				System.out.print("Please input (+, -, *, /, ^): ");
				String strO = scan.next();
				o = checkOperator(strO);
			}while(o == null);
			
			if(o == Operator.Equal) break;
			
			do {
				System.out.print("Enter number: ");
				String strB = scan.next();
				b = checkIn(strB);
			}while(b == null);
			
			Memory = calulation(Memory, o, b);
			System.out.println("Memory: " + Memory);
		};
		System.out.println("==> Result: " + Memory);
	}
	
	
	public void BMICaculator() {
		Scanner scan = new Scanner(System.in);
		
		Double weight, height;
		do {
			System.out.print("Enter weight(kg): ");
			String strW = scan.next();
			weight = checkIn(strW);
		}while(weight == null);
		
		do {
			System.out.print("Enter height(cm): ");
			String strH = scan.next();
			height = checkIn(strH);
		}while(height == null);
		
		System.out.print("==> BMI Status: " + BMIcalculation(weight, height));
	}
}
