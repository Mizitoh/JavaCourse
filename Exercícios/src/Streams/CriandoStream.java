package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		@SuppressWarnings("unused")
		Consumer<Integer> println = System.out::println;
		//não vamos mais ter que ficar digitando syso
		
		//metodo estatico criado a partir da interface
		Stream<String> langs = Stream.of("Java ", "C# ", "Lua ", "JS\n");
		langs.forEach(print);
		
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		System.out.println();
		//imprimindo o indice 1, se passar do indeice, não da erro!!!!! Bafo pra concurso heim
		Arrays.stream(maisLangs, 1, 2).forEach(print);
		System.out.println();
		System.out.println();
		System.out.println("lista, imprimindo em ordem");
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlinz\n");
		outrasLangs.stream().forEach(print);
		System.out.println("imprimindo fora de ordem, por conta de usar threads diferentes");
		outrasLangs.parallelStream().forEach(print);
		
		//Stream.generate(() -> "a").forEach(print); cria uma stream infinita e printa a na tela sem parar.
		//Stream.iterate(0, n -> n + 1).forEach(println); // vai imprimir valores inteiro de forma indefinida
	}

}
