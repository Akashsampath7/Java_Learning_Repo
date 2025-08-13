
public class App {

	public static void main(String[] args) {
		Human h1 = new Human();
		h1.walk();
		walker(h1);
		Robot r1 = new Robot();
		r1.walk();
		walker(r1);
		
		//creating anonymous expression we have only one method.
		walker(new Walkable() {
			@Override
			public void walk() {
				System.out.println("Anonymous method walking...");
			}

			@Override
			public void run() {
				System.out.println("Anonymous method running...");
				
			}
		});
//		
//		//creating lambda expression with regular interface
//		Throwing error beacause must have only one abstract method in functional interface,
//		here in Walkable interface we have 2 methods walk & run so lambda expression wont work.
//		walker(() -> {
//		System.out.println("Lambda expression walking");
//		});
//		
//		//regular interface with lambda expression
//		Walkable walkInterface = (() -> {
//			System.out.println("Walk Interface walking");
//			System.out.println("Walk expression Testing");
//		});
//		walker(walkInterface);
		
		//functional interface with lambda expression
				ALambdaInterface lambdaInterface = (() -> {
					System.out.println("Functional Interface walking");
					System.out.println("Functional expression Testing");
				});
		lambdaInter(lambdaInterface);
		
		ALambdaInterface lambdaInteface = (() -> System.out.println("testing..."));
		lambdaInter(lambdaInteface);
		
	}
	
	
	public static void walker(Walkable walks) {
		walks.walk();
		walks.run();
	}
	
	public static void lambdaInter(ALambdaInterface inter) {
		inter.absMethod();
	}
}
