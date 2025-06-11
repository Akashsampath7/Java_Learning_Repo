package strings_loops_debugger;

public class StringsPractice {

	public static void main(String[] args) {
		String s1 = "abcdefghi";
		System.out.println(s1.length() + " " + s1.charAt(3));
		
		String s2 = s1.substring(3);
		System.out.println(s2);
		
		String s3 = s1.substring(1, 5);
		System.out.println(s3);
		
		String s4 = "hello";
		String s5 = "world";
		
		if(s4.equals(s5)) {
			System.out.println("Yes correct...");
		} else {
			System.out.println("Not different...");
		}
		
		if(s5.equalsIgnoreCase("WoRld")){
			System.out.println("Working...");
		}
		
		String indexPosition = "Hello java code java";
		int a = indexPosition.indexOf("java");
		int b = indexPosition.lastIndexOf("java");
		System.out.println(a);
		System.out.println(b);
	}

}
