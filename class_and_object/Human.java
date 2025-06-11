package class_and_object;

public class Human {

	String name;
	int age;
	int height;
	String eyeColor;
	

	public Human(String name, int age, int height, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.eyeColor = eyeColor;
	}

	public void speak() {
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My height is " + height);
		System.out.println("My eye color is " + eyeColor);
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	public void eat() {
		System.out.println("Eating");
	}
}
