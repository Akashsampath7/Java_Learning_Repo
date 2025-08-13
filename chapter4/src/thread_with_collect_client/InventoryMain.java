package thread_with_collect_client;

import thread_with_collections.InventoryManager;

public class InventoryMain {

	public static void main(String[] args) throws InterruptedException {
		InventoryManager manager = new InventoryManager();
		Thread inventoryTask = new Thread(new Runnable() {
			
			public void run() {
				manager.populateSoldProducts();
			}
		});
		
      Thread displayTask = new Thread(new Runnable() {
			
			public void run() {
				manager.displaySoldProducts();
			}
		});
      
      inventoryTask.start();
      inventoryTask.join();
      displayTask.start();
	}

}
