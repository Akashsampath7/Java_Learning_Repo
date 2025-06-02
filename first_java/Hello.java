package first_java;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		byte number = 10;
		int num = 12;
		number = (byte)(num);
		System.out.println("Int to str: " + number);
		
		//Arrays
		int values[] = new int[3];
		values[0] = 20;
		values[1] = 30;
		values[2] = 40;
		System.out.println(values[2]);
		
		String words[] = new String[] {"My", "Name", "is", "Akash"};
		System.out.println(words[2]);
		
		words =new String[10];
		System.out.println(words[4]);
		
		//Exercise
		System.out.println("Hello\nAkash!");
		int a = 74, b = 36;
		System.out.println(a+b);
		int c = 50, d = 3;
		System.out.println(c/d);
		int aa = (-5)+8 *6;
		System.out.println(aa);
		int bb = (55+9) % 9;
		System.out.println(bb);
		int cc = 20 + (-3*5) / 8;
		System.out.println(cc);
		int dd = 5 + (15/3) * 2 - (8%3);
		System.out.println(dd);
		
		int product1 = 25;
		int product2 = 5;
		System.out.println(product1 * product2);
		
		int eight = 8;
		for(int i = 1; i<=10; i++) {
			System.out.println("8 " + "x " + i + " = " + (eight*i));
		}
		
		int e = 10, f = 20, temporary;
		temporary = e;
		e = f;
		f = temporary;
		System.out.println(e);
		System.out.println(f);
		
	}

}
