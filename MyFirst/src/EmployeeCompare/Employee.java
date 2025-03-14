package EmployeeCompare;

public class Employee implements Comparable<Employee>{
	public String name;
	public int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) {
		if(age==o.age) {
			return 0;
		}else if(age>o.age) {
			return 1;
		}
		return -1;
	}
}
