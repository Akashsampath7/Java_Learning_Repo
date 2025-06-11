package class_and_object;

public class Bird extends Animal implements flyable{

	public Bird(String name, String gender, int speed, int weight) {
		super(name, gender, speed, weight);
	}

	@Override
	public void fly() {
		System.out.println("Flying fast...");
	}
}
