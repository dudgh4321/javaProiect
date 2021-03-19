package yedamAcTest;

public class Employee {
	int empNO;
	String Name;
	String date;
	String depatment;
	int salary;

	public Employee(int empNO, String name, String date, String depatment, int salary) {
		super();
		this.empNO = empNO;
		Name = name;
		this.date = date;
		this.depatment = depatment;
		this.salary = salary;
	}

	public int getEmpNO() {
		return empNO;
	}

	public String getName() {
		return Name;
	}

	public String getDate() {
		return date;
	}

	public String getDepatment() {
		return depatment;
	}

	public int getSalary() {
		return salary;
	}

}
