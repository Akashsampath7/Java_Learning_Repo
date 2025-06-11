package strings_loops_debugger;

class Student implements Cloneable {
	int rollNo;
	String name;


Student(int rollno, String name){
	this.rollNo = rollno;
	this.name = name;
}

public Object clone()throws CloneNotSupportedException{
	return super.clone();
}
}
public class jar_section {

	public static void main(String[] args) {
		try {
			Student s1 = new Student(01, "Akash");
			Student s2 = (Student)s1.clone();
			
			System.out.println(s1.rollNo + " " + s1.name);
			System.out.println(s2.rollNo + " " + s2.name);
		} catch (CloneNotSupportedException c) {}
	}

}
