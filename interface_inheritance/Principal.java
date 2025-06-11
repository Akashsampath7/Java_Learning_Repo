package interface_inheritance;

public class Principal {

	public static void main(String[] args) {
		Student s1 = new Student(86, "A", "Male");
		s1.learn();
		
		Faculty f1 = new Faculty();
		f1.teach();
		
		Cat c1 = new Cat();
		c1.makeNoise();
	}

}
