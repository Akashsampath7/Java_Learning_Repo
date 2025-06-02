package first_java;

public class NewMethodFile {
	public static void example(String argument) {
		System.out.println("method created with string." + argument);
	}
	public static void example(int argument) {
		System.out.println("method created with integer." + argument);
	}
	public static void sumNumbers(int a, int b) {
		System.out.println(a+b);
	}
	public static int addingNumber(int argument) {
		int result = argument + 20;
		return result;
	}
	
	public int adding2Numbers(int data) {
		int num = data+10;
		return num;
	}
}
