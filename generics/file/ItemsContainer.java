package generics.file;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ItemsContainer {

	public static void main(String[] args) {
		Container<Integer, String> container = new Container<>(20, "Hello");
		int val1 = container.getItem1();
		String val2 = container.getItem2();
		System.out.println(val1 + " " + val2);
		
		Set<String> set1 = new HashSet<String>();
		set1.add("Computer");
		set1.add("mouse");
		set1.add("keyboard");
		set1.add("cpu");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("laptop");
		set2.add("printer");
		set2.add("keyboard");
		set2.add("cpu");
		
		Set<String> resultSet = union(set1, set2);
		
		Iterator<String> itr  = resultSet.iterator();
		while(itr.hasNext()) {
			String st = itr.next();
			System.out.println(st);
		}
		
	}
		public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
			Set<E> result = new HashSet<>(set1);
			result.addAll(set2);
			return result;
		}
	

}
