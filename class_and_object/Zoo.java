package class_and_object;

public class Zoo {

	public static void main(String[] args) {
		Animal animal = new Animal("Rabbit", "Male", 110, 10);
		Animal animal1 = new Animal("Horse", "Female", 150, 80);
		animal.details();
		animal.eat();
		animal.sleep();
		animal1.details();

		Bird bird1 = new Bird("Parrot", "male", 100, 10);
		bird1.fly();
		bird1.sleep(); //calling from animal
		
		Hen hen = new Hen();
		hen.fly();
	}

}
