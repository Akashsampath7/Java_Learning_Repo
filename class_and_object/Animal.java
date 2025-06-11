package class_and_object;

public class Animal {

	String name;
	String gender;
	int speed;
	int weight;
	public Animal(String name, String gender, int speed, int weight) {
		this.name = name;
		this.gender = gender;
		this.speed = speed;
		this.weight = weight;
	}
	public void details() {
		System.out.println("Animal name is " + name);
		System.out.println("Animal gender is "+ gender);
		System.out.println("Animal speed is "+ speed);
		System.out.println("Animal weight is "+ weight);
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
	public void eat() {
		System.out.println("Eating...");
	}
}
