package stream.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApp {

	public static void main(String[] args) throws IOException {
		
		//skip first 5 numbers
		IntStream.range(1, 10) //source
		.skip(5) //intermediate operation stream
		.forEach((x) -> System.out.print(x)); //forEach is terminal operation 
System.out.println();

        // sum numbers
		int value = IntStream.range(1, 5) //0+1+2+3+4 soruce
				.sum(); //terminal operation
		System.out.println(value);
		
		//Stream.of, sorted and find first element
		Stream.of("Hello", "Water", "Bottle") //souce
		.sorted() //intermediate operation
		.findFirst() //terminal operation
		.ifPresent((x) -> System.out.println(x));
		
		//Stream from Array, sort, filter and print
		String[] items = {"Car", "Computer", "Toothpaste", "Box", "Pencil", "Tent", "Door", "Toy"};
		Stream.of(items) //source
		.filter((x) -> x.startsWith("T")) //intermediate op
		.sorted() //intermediate op
		.forEach(x -> System.out.print(x + ", ")); //terminal op
		System.out.println();
		
		//Average of squares of an int array
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
		.map((x) -> x*x) //intermediate op
		.average() //terminal op
		.ifPresent(n -> System.out.print(n));
		System.out.println();
		
		//Stream from a list, filter and print
		List<String> listOfItems = Arrays.asList("Computer", "Toothpaste", "Box", "Pencil", "Car", "Tent", "Door", "Toy");
		listOfItems.stream()
		.map(x -> x.toLowerCase())
		.filter(x -> x.startsWith("c"))
		.sorted()
		.forEach(x -> System.out.print(x + ", "));
		System.out.println();
		
		//displaying length more than 6 letters using file.
		Stream<String> lines = Files.lines(Paths.get("C:/Users/akash.sampath/eclipse-workspace/Lambda-java8/file/wordFile.txt"));
		lines.sorted()
		.filter(x -> x.length() > 6)
		.forEach(y -> System.out.println(y+ ", "));
		System.out.println();
		
		//using contains letter
		List<String> words = Files.lines(Paths.get("C:/Users/akash.sampath/eclipse-workspace/Lambda-java8/file/wordFile.txt"))
		.filter(x-> x.contains("th"))
		.collect(Collectors.toList());
		words.forEach(x-> System.out.println(x + ", "));
		System.out.println();
		
		//using count full rows having value
		Stream<String> rows = Files.lines(Paths.get("C:/Users/akash.sampath/eclipse-workspace/Lambda-java8/file/stockDataCsv.txt"));
		int rowCount = (int) rows
				.map(x -> x.split(","))
				.filter(x -> x.length > 3)
				.count();
		System.out.println(rowCount + " good rows.");
		rows.close();
		System.out.println();
		
		Stream<String> fullRows = Files.lines(Paths.get("C:/Users/akash.sampath/eclipse-workspace/Lambda-java8/file/stockDataCsv.txt"));
				fullRows.map(x -> x.split(","))
				.filter(x -> x.length > 3)
				.filter(x -> Integer.parseInt(x[1].trim()) > 15)
				.forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
		rows.close();
		System.out.println();
	}

}
