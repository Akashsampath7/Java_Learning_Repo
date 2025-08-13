package lambda.builtin.practical;

public class EmployeePractice {

	String name;
	String department;
	int salary;
	
	public EmployeePractice(String name, String department, int salary) {
		this.name= name;
		this.department = department;
		this.salary = salary;
	}
	public String toString() {
		return "Employee: Name = " + name + " Department = " + department + " Salary = " + salary;
	}
	
	public void printEmployee() {
		System.out.println(this);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
