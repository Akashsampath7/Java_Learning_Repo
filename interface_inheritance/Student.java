package interface_inheritance;

public class Student extends Faculty {

	int marks;
	String grade;
	String gender;
	
	public Student(int marks, String grade,	String gender) {
		this.marks = marks;
		this.grade = grade;
		this.gender = gender;
	}
	
	public void learn() {
		System.out.println("Total marks..." + marks);
		System.out.println("Overall grade " + grade);
		System.out.println("Student gender " + gender);
	}

}
