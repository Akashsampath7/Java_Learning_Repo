package lambda.builtin.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		
		List<Car> cars = Arrays.asList(
				new Car("Honda", "Accord", "Red", 22500),
				new Car("Honda", "Civic", "Blue", 21500),
				new Car("Toyato", "Land Cruiser", "White", 25000),
				new Car("Toyato", "Corolla", "Black", 26000),
				new Car("Toyato", "Camry", "Blue", 27000),
				new Car("Nissan", "Sentra", "White", 30000),
				new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 23000)
				);
		printCarsPriceRange(cars, 20000, 30000);
		printCarByColor(cars, "White");
		printModel(cars, "Lancer");
		printCar(cars);
		
		System.out.println("Printing lambda exp values:");
		//anonymous method
//		printCars(cars, new CarCondition() {
//
//			@Override
//			public boolean test(Car c) {
//				return c.getPrice() >= 27000 && c.getPrice() <= 30000;
//			}
//		});
//		//anonymous method
//		printCars(cars ,new CarCondition() {
//
//			@Override
//			public boolean test(Car c) {
//				return c.getColor().equals("Black");
//			}
//			
//		});
		System.out.println("displaying 2 condition result in single lambda exp.");
		printCars(cars, (c) -> 
			c.getPrice() >= 27000 && c.getPrice() <= 30000
		);
		printCars(cars, (c) -> {
			return c.getColor().equals("Black");
		});
		//lambda expression
//		carLambda carLam = ((List<Car> cars)-> {
//			for(Car c2: cars) {
//				c2.printcar();
//			}
//		});
		Function<Car, String> priceAndColor = (c) -> "price = " + c.getPrice() + ",Color = " + c.getColor();
		String carStr = priceAndColor.apply(cars.get(0));
		System.out.println(carStr);
	}
	
	public static void printCarsPriceRange(List<Car> cars, int low, int high) {
		for(Car c: cars) {
			if(low <= c.getPrice() && high >= c.getPrice()) {
				c.printcar();
			}
		}
	}
	
	public static void printCarByColor(List<Car> cars, String color) {
		for(Car c: cars) {
			if(c.getColor().equals(color)) {
				c.printcar();
			}
		}
	}
	
	public static void printModel(List<Car> carModel, String model) {
		for(Car modelList: carModel) {
			if(modelList.getModel().equals(model)) {
				modelList.printcar();
			}
		}
	}
	
	public static void printCar(List<Car> carList) {
		for(Car car1: carList) {
			car1.printcar();
		}
	}
	
	public static void printCars(List<Car> cars, Predicate<Car> predicate) {
		for(Car c: cars) {
			if(predicate.test(c)) {
				c.printcar();
			}
		}
	}
	
	//interface
	interface CarCondition<T> {
		public boolean test(T t);
	}
}
