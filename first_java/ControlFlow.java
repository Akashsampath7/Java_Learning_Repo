package first_java;

public class ControlFlow {

	public static void main(String[] args) {
		boolean cars = true;
		if(cars) {
			System.out.println("Engine started");
		} else {
			System.out.println("Engine problem");
		}
		
		int values = 10;
		int currentValues = 12;
		if(values > currentValues) {
			System.out.println("value is lesser");
		} else if(values != 10) {
			System.out.println("value is equal");
		} else {
			System.out.println("value is greater");
		}

		int month = 2;
		String monthWord;
		
		switch(month) {
			case 1: monthWord = "January";
			break;
			case 2: monthWord = "Feburary";
			break;
			case 6: monthWord = "June";
			break;
			default: monthWord = "None";
		}
		System.out.println("Current month is: " + monthWord);
	}

}
