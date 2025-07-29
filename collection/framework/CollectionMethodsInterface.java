package collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CollectionMethodsInterface {

	public static void main(String[] args) {
		HashSet<Integer> list1 = new HashSet<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(20);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);

		ArrayList<Integer> arrayList = new ArrayList<Integer>(list1);
		Collections.sort(arrayList);
		System.out.println("Sorting values: " + arrayList);
		
		
		list1.addAll(list2);
		System.out.println("Adding both list values: " + list1);
		
		list1.removeAll(list2);
		System.out.println("Removing list2 values contains in list 1: " + list1);
		
		boolean listValue = list1.contains(30);
		System.out.println("Checking value 30 is present in list1: " + listValue);
		
		list1.clear();
		boolean listEmpty = list1.isEmpty();
		System.out.println("Cleared all and checking its empty or not: " + listEmpty);
		
		
		HashSet<Employee> employee = new HashSet<Employee>();
		employee.add(new Employee("Akash", 2000, "IT"));
		employee.add(new Employee("Dhanush", 3000, "Account"));
		employee.add(new Employee("Suriya", 1000, "Maintenance"));
		
		ArrayList<Employee> emp = new ArrayList<Employee>(employee);
		Collections.sort(emp);
		System.out.println("Compare emp lists: " + emp);
		
	}

}
