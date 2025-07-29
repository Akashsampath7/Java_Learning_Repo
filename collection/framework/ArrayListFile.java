package collection.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class ArrayListFile {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Lion");
		a1.add("Cat");
		a1.add("Tiger");
		System.out.println(a1);
		for(String a: a1) {
			System.out.println(a);
		}
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		l1.remove(2);
		for(int l: l1) {
		System.out.println(l);
		}
		
		List<Vehicle> v1 = new LinkedList<Vehicle>();
		Vehicle vehicle = new Vehicle("Toyato", "camery", 12000, false);
		v1.add(new Vehicle("Honda", "accord", 12000, false));
		v1.add(vehicle);
		
		for(Vehicle v3: v1) {
			System.out.println(v3);
		}
		
		List<Integer> lists = Arrays.asList(1,2,3,1,3,4, 5, 6,3);
		List<Integer> asLists = new ArrayList<>(new LinkedHashSet<>(lists));
		System.out.println(asLists); //remove duplicates in list using LinkedHashSet
		
		////////ArrayList
		// 1. Create list of strings.
		List<String> list = new ArrayList<>();
		// 2. Add elements to list
		list.add("apple");
		list.add("banana");
		list.add("apple"); // allow duplicates
		System.out.println("fruits: " + list);
		
		
		
		System.out.println("fruits index: "+ list.get(0)); // access elements by index
		
		list.set(1, "grapes"); //update an element
		System.out.println("fruits set: " + list);
		
		list.remove("apple"); // remove an element
		System.out.println("fruits remove: " + list);
		
		System.out.println("Contains Apple? " + list.contains("Apple")); //Check if list contains a value
		System.out.println("list size: " + list.size()); //list size
		
		for (String fruit : list) {
            System.out.println("list through loop: " + fruit);
        }
		
		/////LinkedList
		List<String> state = new LinkedList<>();
		state.add("goa");
		state.add("Kerala");
		state.add("Delhi");
		state.add("kerala"); //add value
		System.out.println("state list: " + state);
		
		state.add(1, "bangalore"); //add index value
		System.out.println("add index: " + state);
		
		state.remove(2); //remove value
		System.out.println("remove index state: " + state);
		
		String a = state.get(3); // get index
		System.out.println("get state index: " + a);
		
		state.set(2, "tamil nadu");
		System.out.println("set state: " + state);
		
		System.out.println("state size: " + state.size());
		
		System.out.println("state is empty?: " + state.isEmpty());
	}

}
