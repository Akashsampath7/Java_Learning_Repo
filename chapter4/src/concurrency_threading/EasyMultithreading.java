package concurrency_threading;

class Teacher extends Thread { //create class and extends Thread
	public void run() {
	for(int i= 0; i<=5; i++) {
		System.out.println("Teacher no: " +i);
		try {
			Thread.sleep(2000); //adding 5 milliseconds delay 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}

class Student { //create normal class 
	void studentList() {
	for(int i= 0; i<=5; i++) {
		System.out.println("Student no: " +i);
		
	}
}
}

class Student1 implements Runnable{ 
	public void run() {
	for(int i= 0; i<=5; i++) {
		System.out.println("Student Runnable no: " +i);
	}
}
}

//creating synchronized thread
class Synch {
	synchronized void table(int n) {
		for( int i = 1; i<=5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class EasyMultithreading {

	public static void main(String[] args) throws InterruptedException {
		Teacher teacher = new Teacher();
		if(teacher.isAlive()) {
			System.out.println("Teacher thread is executing...");
		}
		teacher.start();
		if(teacher.isAlive()) {
			System.out.println("Teacher thread is executing...");
		}
		Student student = new Student();
		student.studentList();
		
		teacher.join(); //  join is used for stopping the next line until finishing the teacher thread.
		System.out.println("Closing program.."); // this line will execute after completing teacher thread.
		
		Runnable runn = new Student1();
		Thread t1 = new Thread(runn);
		t1.start();
		
		//creating Anonymous 
		Runnable r1 = new Runnable() {
			public void run() {
				for(int i= 0; i<=5; i++) {
					System.out.println("Anonymous Runnable no: " +i);
				}
			}
		};
		Thread t2 = new Thread(r1);
		t2.start();
		
		//Using Lambda expression
		Runnable r2 = () -> {
				for(int i= 0; i<=5; i++) {
					System.out.println("Lambda Runnable no: " +i);
				}
		};
		Thread t3 = new Thread(r2);
		t3.setName("Lambda List: "); //giving name thread.
		System.out.println(t3.getName()); //displaying thread name.
		t3.setPriority(Thread.MAX_PRIORITY); //setting priority like min=0, max= 10, normal= 5
		System.out.println(t3.getPriority());
		t3.start();
	
	Synch s1 = new Synch();
	
	Thread sync1 = new Thread() {
	 public void run() {
		 s1.table(5);
	 }
	};
	
	Thread sync2 = new Thread() {
		 public void run() {
			 s1.table(10);
		 }
		};
		
		sync1.start();
		sync2.start();

	}
	}

