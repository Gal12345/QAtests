package Vezbi;

public class Employee {

	private String name;
	private String lname;
	private double salary;

	public Employee(String name, String lname, double salary) {
		super();
		this.name = name;
		this.lname = lname;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double yearlySalary(double salary) {
		if (salary < 0) {
			salary = 0;
		}
		return salary * 12;
	}

	public double raiseSalary(double salary) {
		if (salary < 0) {
			salary = 0;
		}
		return salary + (salary * 0.1);
	}
}
