package stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PracticeExcercise {

	public static void main(String[] args) {
		List<EmployeeDetails> emp = Arrays.asList(
				new EmployeeDetails("Akash", 20000, "IT"),
				new EmployeeDetails("Sridhar", 30000, "Marketing"),
				new EmployeeDetails("Priya", 50000, "Civil"),
				new EmployeeDetails("Dhanush", 60000, "Finance"),
				new EmployeeDetails("Vijay", 100000, "Agricultaure")			
				);
		emp.stream()
		.filter( e -> e.getSalary() >= 50000)
		.sorted(Comparator.comparing(EmployeeDetails::getName))
		.map(e -> e.getName().toUpperCase())
		.forEach(System.out::println);	
	
		//even numnbers
		List<Integer> list = Arrays.asList(10, 3, 5, 8, 2, 7, 6);
		list.stream()
		.filter(e -> e % 2 == 0)
		.forEach(System.out::println);
		
		emp.stream()
		.filter(e -> e.getSalary() > 50000)
		.sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
		.map(EmployeeDetails::getName)
		.forEach(System.out::println);
		
		//even numbers
		List<Integer> l1 = Arrays.asList(4, 5, 6, 23, 24, 56, 47, 453, 6574);
		l1.stream()
		.filter(e -> e % 2 == 0)
		.forEach(e -> System.out.print(e + " "));
		
		//string uppercase
		List<String> name = Arrays.asList("Akash", "Dhanush", "sridhar", "priya", "navin");
		name.stream()
		.map(e -> e.toUpperCase())
		.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		//count namestarts with A
		List<String> n1 = Arrays.asList("Akash", "Dhanush", "Alwin", "priya", "navin");
		long c = n1.stream()
		.filter(e -> e.startsWith("A"))
		.count();
		System.out.println("Count: " + c);
		System.out.println("hfrl");
		
		//print numbers in square 
		List<Integer> l2 = Arrays.asList(4, 5, 6, 23, 24, 56, 47, 453, 6574);
		l2.stream()
		.map(e -> e * e)
		.forEach(System.out::println);
		
		//max value in list
		int num = l2.stream()
				.max(Integer:: compare)
				.get();
		System.out.println(num);
		
		//sum of list
		int sum = l2.stream()
		.mapToInt(Integer::intValue)
		.sum();
		System.out.println("total value: " + sum);
	}

}

 class EmployeeDetails {
	 String employeeName;
	 int salary;
	 String department;
	 public EmployeeDetails(String employeeName, int salary, String department) {
		 this.employeeName = employeeName;
		 this.salary = salary;
		 this.department = department;
	 }
	 public String getName() {
		 return employeeName;
	 }
	 public double getSalary() {
		 return salary;
	 }
	 public String depatment() {
		 return department;
	 }
 }