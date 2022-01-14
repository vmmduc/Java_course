package Exercise_2;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Nguyen","Van A", 100);
		Employee e2 = new Employee("David","Edward", 50);
		
		System.out.println("Employee' yearly salary of e1: " + e1.getMonthly_salary());
		System.out.println("Employee' yearly salary of e2: " + e2.getMonthly_salary());
		
		double s1 = e1.getMonthly_salary();
		double s2 = e2.getMonthly_salary();
		
		e1.setMonthly_salary(s1 + s1*0.1);
		e2.setMonthly_salary(s2 + s2*0.1);
		
		System.out.println("Employee' yearly salary of e1: " + e1.getMonthly_salary());
		System.out.println("Employee' yearly salary of e2: " + e2.getMonthly_salary());
	}

}
