package collection.framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashmap {

	public static void main(String[] args) {
		
		TreeMap<String, String> dictionary =  new TreeMap<String, String>();
		dictionary.put("Brave", "ready to face and endure danger or pain, showing courage");
		dictionary.put("Brilliant", "exceptionally clever or talented");
		dictionary.put("Joy", "a feeling of great pleasure and happiness");
		dictionary.put("Confidence", "the state of feeling certain about the truth of something");
 
		for(String word: dictionary.keySet()) {
			System.out.println(word + " - " + dictionary.get(word));
		}
		
		for(Map.Entry<String, String> entry: dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		///////HashMap
		 // Create a HashMap
        Map<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(101, "David"); // Key 101 is updated from "Alice" to "David"
        students.put(null, "Eve");  // null key is allowed
        students.put(104, null);    // null value allowed
        students.put(105, null);    // another null value

        // Display the map
        System.out.println("Student Map: " + students);

        // Access a value using key
        System.out.println("Student with ID 102: " + students.get(102));

        // Remove a key-value pair
        students.remove(103);
        System.out.println("After removing ID 103: " + students);

        // Check if key or value exists
        System.out.println("Contains key 101? " + students.containsKey(101));
        System.out.println("Contains value 'Bob'? " + students.containsValue("Bob"));

        // Iterate through entries
        System.out.println("All entries:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        
        ////////////////LinkedHashMap
        // Create a LinkedHashMap
        Map<Integer, String> languages = new LinkedHashMap<>();

        // Add key-value pairs
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "C++");
        languages.put(4, "JavaScript");
        languages.put(null, "Ruby");   // one null key
        languages.put(5, null);        // multiple null values allowed

        // Display the map
        System.out.println("Languages: " + languages);

        // Get a value
        System.out.println("Language with key 2: " + languages.get(2));

        // Remove a key
        languages.remove(3);
        System.out.println("After removing key 3: " + languages);

        // Iterate using entrySet
        System.out.println("Iterating entries:");
        for (Map.Entry<Integer, String> entry : languages.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
	}

}
