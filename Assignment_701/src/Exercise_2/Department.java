package Exercise_2;

import java.util.ArrayList;
import java.util.List;

import Exercise_2.Employee;

public class Department {
	String departmentName;
	ArrayList<Employee> listOfEmployee;
	
	public Department() {
		listOfEmployee = new ArrayList<Employee>();
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public void display() {
		System.out.println();
	}
}
