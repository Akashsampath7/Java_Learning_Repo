package class_and_object;

public class Earth {

	public static void main(String[] args) {
		
		Human human1 = new Human("Akash", 25, 160, "Black");
		Human human2 = new Human("Sampath", 55, 159, "Black");
		
		human1.speak();
		human2.speak();
		human1.eat();
	}
}
