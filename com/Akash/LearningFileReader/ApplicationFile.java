package com.Akash.LearningFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ApplicationFile {

	public static void main(String[] args) {

		File file = new File("myfile.txt");
//		BufferedReader bufferReader = null;
//		FileReader fileReader = null;
		
		/*try with resources included in java 7 we no need to use finally */
		try(FileReader fileReader = new FileReader(file);
				BufferedReader bufferReader = new BufferedReader(fileReader);) {
			
//		}
		
//		try {
//			fileReader = new FileReader(file);
//			bufferReader = new BufferedReader(fileReader);
			String line = bufferReader.readLine();
			
			while(line !=null) {
				System.out.println(line);
				line = bufferReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found...");
		} catch (IOException e) {
			e.printStackTrace();
		} 
//		finally {
//			try {
//				if(bufferReader != null) {
//					bufferReader.close();	
//				}
//				if(fileReader != null) {
//					fileReader.close();	
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
	}

}
