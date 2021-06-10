package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (acumulador, n) -> acumulador + n;
		
		//reduce � uma expressao terminal, assim como o foreach
		Integer total = nums.stream().reduce(soma).get();
		System.out.println(total);
		
		Integer total2 = nums.parallelStream().reduce(100, soma);
		System.out.println(total2);
		
		Integer total3 = nums.parallelStream().reduce(0, soma);
		System.out.println(total3); // cuidado com parallel
		
		Integer total4 = nums.stream().reduce(100, soma);
		System.out.println(total4);
		
		//professor ressaltou a diferen�a entre Integer que aceita null 
		//e int que n�o aceita, por esse motivo, estamos usando Integer como tipo aqui
		
		nums.stream().filter(n -> n > 5)
					 .reduce(soma)
					 .ifPresent(System.out::println); // se n�o tiver presente 
													  //a compara��o, retorna nada

		
	}

}
