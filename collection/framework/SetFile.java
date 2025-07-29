package collection.framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetFile {

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<Integer>();
		values.add(20);
		values.add(30);
		values.add(40);
		values.add(50);
		values.add(30);
		
		for(Integer value: values) {
			System.out.println(value);
		}
		HashSet<String> values1 = new HashSet<String>();
		values1.add("Akash");
		values1.add("Dhanush");
		values1.add("Suriya");
		values1.add("Akash");
		values1.add("Lokesh");
		
		for(String value: values1) {
			System.out.println(value);
		}
		
		HashSet<HashSetAnimal> animal = new HashSet<HashSetAnimal>();
		HashSetAnimal animalValue1 = new HashSetAnimal("Lion", 5, "Male", 70);
		HashSetAnimal animalValue2 = new HashSetAnimal("Rabbit", 4, "Female", 2);
		HashSetAnimal animalValue3 = new HashSetAnimal("Rabbit", 4, "Female", 2);
		animal.add(animalValue1);
		animal.add(animalValue2);
		animal.add(animalValue3);
		
		System.out.println(animalValue2.equals(animalValue3));
		System.out.println(animalValue2.hashCode());
		System.out.println(animalValue3.hashCode());
		
		for(HashSetAnimal a: animal) {
			System.out.println(a);
		}
		
		////////HashSet
		//1. Create hashSet of strings
		Set<String> countries = new HashSet<>();
		countries.add("India");
		countries.add("North Korea");
		countries.add("South Korea");
		countries.add("india");
		countries.add("India"); //allows duplicate
 		countries.add(null); //one null is allowed
		countries.add(null); //second null is ignored
		System.out.println("set values: " + countries);
		
		// Check if an element exists
        System.out.println("Contains USA? " + countries.contains("USA"));
        
        // Remove an element
        countries.remove("india");
        System.out.println("After removing Canada: " + countries);

        // Iterate using for-each
        System.out.println("Looping through set:");
        for (String country : countries) {
            System.out.println(country);
        }
		
        
        /////////LinkedHashSet
        Set<String> cities = new LinkedHashSet<>();

        // Add elements
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Delhi"); // Duplicate - will be ignored
        cities.add(null);    // One null allowed
        cities.add(null);    // Second null ignored

        // Display the set
        System.out.println("Cities: " + cities);  // Order is maintained

        // Check if it contains a value
        System.out.println("Contains Chennai? " + cities.contains("Chennai"));

        // Remove an element
        cities.remove("Delhi");
        System.out.println("After removing Delhi: " + cities);

        // Iterate through the set
        System.out.println("Looping through set:");
        for (String city : cities) {
            System.out.println(city);
        }
	}

}
