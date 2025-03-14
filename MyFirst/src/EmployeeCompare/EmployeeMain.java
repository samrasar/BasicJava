package EmployeeCompare;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("abc", 28));
		emp.add(new Employee("bcd", 25));
		emp.add(new Employee("cde", 29));
		emp.add(new Employee("fgh", 30));
		Collections.sort(emp);
		for (Employee e : emp) {
			System.out.println(e.name);
			System.out.println(e.age);
		}
	}
}
