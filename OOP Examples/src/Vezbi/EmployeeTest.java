package Vezbi;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Ime", "Prezime", 1100);
		Employee emp2 = new Employee("Ime2", "Prezime2", 800);

		System.out.println("For Employee 1, " + emp1.getName() + " " + emp1.getLname() + ", the yearly salary is = " + emp1.yearlySalary(emp1.getSalary())
				+ "\nFor Employee 1 the raised yearly salary is = " + emp1.yearlySalary(emp1.raiseSalary(emp1.getSalary()))
				+ "\nFor Employee 2 " + emp2.getName() + " " + emp2.getLname()+ " the yearly salary is = " + emp2.yearlySalary(emp2.getSalary())
				+ "\nFor Employee 2 the raised yearly salary is = " + emp2.yearlySalary(emp2.raiseSalary(emp2.getSalary())));

	}

}
