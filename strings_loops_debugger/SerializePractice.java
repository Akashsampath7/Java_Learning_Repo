package strings_loops_debugger;
import java.io.*;

//1. Person class must implement Serializable
class Person implements Serializable {
 private static final long serialVersionUID = 1L;
 String name;
 int age;

 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public String toString() {
     return name + " (" + age + ")";
 }
}

public class SerializePractice {
 public static void main(String[] args) {
     // Create an object
     Person person = new Person("Alice", 25);

     // Serialize the object to a file
     try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
         out.writeObject(person);
         System.out.println("Person object serialized.");
     } catch (IOException e) {
         e.printStackTrace();
     }

     // Deserialize the object from the file
     try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
         Person restoredPerson = (Person) in.readObject();
         System.out.println("Deserialized Person: " + restoredPerson);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}