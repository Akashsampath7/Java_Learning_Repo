package concurrency_threading;

public class SynchronizationSequence {
	private int value = 0;
	
	public synchronized int getInt() {
//	public int getInt() {
//		synchronized(this) {
		value++;
		return value;
		}
//	}
}
