package concurrency_threading;

public class SynchronizationThreading {

	public static void main(String[] args) {
		SynchronizationSequence sequence = new SynchronizationSequence();
		
		Worker worker1 = new Worker(sequence);
		worker1.start();
		
		Worker worker2 = new Worker(sequence);
		worker2.start();
	}

}

class Worker extends Thread {
	SynchronizationSequence sequence = null;
	
	public Worker(SynchronizationSequence sequence) {
		this.sequence = sequence;
	}
	
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().getName()+ " got value: " + sequence.getInt());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
	}
}
