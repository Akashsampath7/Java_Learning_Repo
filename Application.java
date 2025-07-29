import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {

		//keyboard input
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name: ");
		String s1 = sc.nextLine();
		System.out.println("Enter your name is : " + s1);
		
		//Exception handling using try catch using text file
//		try {
			File file = new File("myfile.txt");
			Scanner s2;
			s2 = new Scanner(file);
			while (s2.hasNextLine()) {
				String fileData = s2.nextLine();
				System.out.println(fileData);
			}
			s2.close();
//		} catch (FileNotFoundException e) {
////			System.out.println("File not found");
//			e.printStackTrace();
//		}
		
		ErrorUsingClass c1 = new ErrorUsingClass();
		try {
			System.out.println(c1.minusNumbers(3));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
}
}
