package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		//Consumer<String> print = System.out::print;
		System.out.println();
		
		//Function<Integer, String> binario = n  -> Integer.toBinaryString(n);
		UnaryOperator<String> inverter = i -> new StringBuilder(i).reverse().toString();
		Function<String, Integer> voltaInt = v -> Integer.parseInt(v, 2);
		
		
		nums.stream().map(Integer::toBinaryString)
		.map(inverter)
		.map(voltaInt)
		.forEach(System.out::println);
	}

}
