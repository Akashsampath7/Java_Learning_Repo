package concurrency_threading;

public class MultithreadingFile {

	public static void main(String[] args) {
		System.out.println("Starting Thread 1...");
		Task taskRunner = new Task("Thread A");
//		taskRunner.start();
		Thread t1 = new Thread(taskRunner);
		t1.start(); //should not call thread more than once
		
		System.out.println("Running multi threading...");
		System.out.println("Starting thread 2...");
		Task taskRunner2 = new Task("Thread B");
		Thread t2 = new Thread(taskRunner2);
		t2.start();
//		taskRunner2.start();
	}

}

class Task implements Runnable {
	String thread1;
	
	public Task(String name) {
		this.thread1 = name;
	}
	
	public void run() {
		Thread.currentThread().setName(this.thread1);
		for(int i =0; i<1000; i++) {
			System.out.println("number is: "+ i + " - " + Thread.currentThread().getName()); // this will display output with thread (first thread star with 0)
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}