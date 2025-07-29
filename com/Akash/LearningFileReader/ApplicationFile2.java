package com.Akash.LearningFileReader;

import java.io.IOException;

class MyClass implements AutoCloseable {
	
	@Override
	public void close() throws Exception {
		System.out.println("Closing file...");	
	}
	
}

public class ApplicationFile2 {
	
	public static void main(String[] args) throws Exception {
		try(MyClass c1 = new MyClass();) {
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
