package strings_loops_debugger;

public class Loops {

	public static void main(String[] args) {
		int count = 0;
		while(count <= 30) {
			System.out.println("Akash" + count);
			count = count +1;
			
			if(count == 20) {
				break;
			}
		}
		
		for(int i = 0; i<=20; i++) {
			System.out.println("i " + i);
		}
		String words = "priujpimfwjpoiw";
		for(int i  = 0; i < words.length(); i++) {
			System.out.println("char: " + words.charAt(i));
		}
		
		int counter = 0;
		for(int i = 0; i <= 100; i++) {
			System.out.println(i);
			int temporary = counter + 1;
			counter = temporary;
		}
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.println("Values are printing... "+ i + " with " + j);
			}
		}
	}
}
