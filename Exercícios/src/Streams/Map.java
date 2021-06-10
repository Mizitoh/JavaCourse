package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		List<String> marcas = Arrays.asList("BMW ", "Honda ", "Audi");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> maiscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		//UnaryOperator<String> grito = n -> n + " !!!!!!!!!!!!!! ";
		//mudei essa unary para uma função de outra clase pra passar por method reference
		UnaryOperator<String> oquefazotrim = n -> n.trim(); //retira espacos do fim das strings
		
		System.out.println("\n\nusando composicao...\n");
		marcas.stream().map(maiscula)
		.map(primeiraLetra)
		.map(Utilitarios::grito).forEach(print);
		
		maiscula.andThen(primeiraLetra)
		.andThen(Utilitarios::grito)
		.andThen(oquefazotrim)
		.apply("bmw");
		
	}

}
