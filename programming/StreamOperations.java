import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(4,5,6,7,8,9,10,1,2,3);

		//Distinct numbers in sorted order
		numbers.stream()
			.distinct()
			.sorted()
			.forEach(System.out::println);

		//Mapping
		numbers.stream()
				.map(number -> number * number)
				.collect(Collectors.toList())
				.forEach(System.out::println);

		//Filtering
		numbers.stream()
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList())
				.forEach(System.out::println);

		//Reduce
		Syste.out.pritln(numbers.stream()
				.reduce(0, (x,y) -> x*x + y*y));

		//Sort using comparator
		List<String> strings = List.of("abc", "abc def ghi jkl", "abc def", "qwerty", "xyz", "MNOP");

		strings.stream()
				.sorted(Comparator.comparing(str -> str.length()))
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}
}
