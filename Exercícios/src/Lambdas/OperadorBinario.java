package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) /2;
		System.out.println(media.apply(9.8, 5.7));
		
		BiFunction<Double, Double, String> resultado = 
				(n1, n2) -> ((n1 + n2) /2) >= 7 ? "Aprovado" : "reprovado";
				
		BiFunction<Double, Double, String> resultado2 = 
				(n1, n2) -> { double notaFinal = (n1 + n2) /2; 
				return notaFinal >= 7 ? "Aprovado" : "reprovado";};
				
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "reprovado";
		
		System.out.println(resultado.apply(10.0, 2.0));
		System.out.println(resultado2.apply(8.15, 2.20));
		System.out.println(media.andThen(conceito).apply(8.5, 10.0));
	}

}
