package Exercise_2;

public class Employee {
	String First_name;
	String Last_name;
	double Monthly_salary;
	
	// Constructor
	public Employee(String First_name, String Last_name, double salary) {
		this.First_name = First_name;
		this.Last_name = Last_name;
		this.Monthly_salary = salary;
	}
	
	// Getter
	public String getFirst_name() {
		return First_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public double getMonthly_salary() {
		return this.Monthly_salary < 0 ? 0.0 : this.Monthly_salary;
	}
	
	//Setter
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public void setMonthly_salary(double monthly_salary) {
		Monthly_salary = monthly_salary;
	}
	
}
