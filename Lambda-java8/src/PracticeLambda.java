
public class PracticeLambda {

	public static void main(String[] args) {
		
		ALambdaInterface helloVar = (() -> System.out.println("Hellothere..."));
		lambdaInter(helloVar);
		
		ALambdaInterface sumNum = (() -> {
		int sumNums = 5 + 5;
		System.out.println(sumNums);
		});
		lambdaInter(sumNum);
		
		//using lambda adding 2 numbers in lambda expression.
		sumNums sumNumber = ((a, b) -> a + b);
		helloVar.absMethod();
		System.out.println(sumNumber.sums(4, 5));
		
		//using lambda dividing 2 numbers
		sumNums divideNum = ((a, b) -> {
			if(a== 0) {
				return 0;
			}
			return a/b;
		});
		System.out.println(divideNum.sums(0, 3));
		
		//normal object creating and reversing string.
		PracticeLambda rev = new PracticeLambda();
		System.out.println(rev.reverse("logical"));
		
		//using lambda reverse string
		reverseWord reverseLetter = (str) ->{
			String result = "";
			for(int i = str.length() -1; i >=0; i--) {
				result = result + str.charAt(i);
			}
			return result;
		};
		System.out.println(reverseLetter.str("asdfcrer3223"));
		
		//using lambda factorial number
		myGenericInterface<Integer> factorialNum = ((num) -> {
			int result= 1;
			for(int i = 1; i<=num; i++) {
				result = i*result;
			}
			return result;
		});
		System.out.println(factorialNum.work(10));
	}

	//Normal method print statement
	public void sayHello() {
		System.out.println("Hello there...");
	}
	
	//normal method add 2 num
	public int sum(int args1 , int args2) {
		return args1+args2;
	}
	//normal method divide 2 num 
	public int nonZeroDivide(int a, int b) {
		if(a == 0) {
			return 0;
		}
		return a/b;
	}
	//normal method print reverse string
	public String reverse(String str) {
		String result = "";
		for(int i = str.length() -1; i >=0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}
	//normal method factorial number
	public int factorial(int num) {
		int result= 1;
		for(int i = 1; i<=num; i++) {
			result = i*result;
		}
		return result;
	}
	
	public static void lambdaInter(ALambdaInterface inter) {
		inter.absMethod();
	}
}

interface sumNums {
	public int sums(int a, int b);
}

//reverseWord and factorialNumber interface have different data type so we can create only
//one interface that support multiple data types.
interface myGenericInterface<T> {
	public T work(T t);
}
interface reverseWord {
	public String str(String s1);
}
interface factorialNumber {
	public int facNum(int a);
}