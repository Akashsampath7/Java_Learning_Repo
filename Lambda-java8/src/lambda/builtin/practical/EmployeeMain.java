package lambda.builtin.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeMain {

	public static void main(String[] args) {
		List<EmployeePractice> emp = Arrays.asList(
				new EmployeePractice("Pradeep", "IT", 20000),
				new EmployeePractice("Arun", "Civil", 80000),
				new EmployeePractice("Sandeep", "Marketing", 40000),
				new EmployeePractice("John", "Finance", 50000)
				);
		System.out.print(emp.toString());
		
		printEmployee(emp, e -> e.getSalary() >= 50000);
		
		Function<EmployeePractice, String> nameAndDepSal = (empq) -> 
		"Name= " + empq.getName() + ",Dep= " + empq.getDepartment() + ",sal= " + empq.getSalary();
		String nameStr = nameAndDepSal.apply(emp.get(0));
		System.out.println(nameStr);
		
		List<Integer> multiply = Arrays.asList(2, 3, 4, 5, 6);
		multiply.forEach(n -> System.out.println(n * 2));
		
		Add add = (a, b) -> a+b;
		System.out.println(add.sum(3, 3));
	}

	public static void printEmployee(List<EmployeePractice> empList, Predicate<EmployeePractice> predicate) {
		for(EmployeePractice e: empList) {
			if(predicate.test(e)) {
				e.printEmployee();
			}
		}
	}
	interface EmployeeInter<T> {
		public boolean test(T t);
	}
	interface Add{
		int sum(int a, int b);
	}
}
