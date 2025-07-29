package generics.file;

import java.util.ArrayList;
import java.util.List;

public class GenericWithWildCards {

	public static void main(String[] args) {
		
		Object myObject = new Object();
		String myVar = "Hello";
		myObject = myVar;
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee());
		ArrayList<Accountant> accountant = new ArrayList<Accountant>();
		accountant.add(new Accountant());
//		employee = accountant;
		
		ArrayList<?> employee2 = new ArrayList<>();
		ArrayList<String> accountant2 = new ArrayList<String>();
		employee2 = accountant2;
		
		ArrayList<? extends Employee> employee3 = new ArrayList<>();
		ArrayList<Accountant> accountant3 = new ArrayList<Accountant>();
		employee3 = accountant3;
		
		ArrayList<? super Employee> employee4 = new ArrayList<>();
		ArrayList<Accountant> accountant4 = new ArrayList<Accountant>();
//		employee4 = accountant4;
		
		makeEmployeeWork(accountant);
	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for(Employee emp: employees) {
		emp.work();
		}
	}

}
