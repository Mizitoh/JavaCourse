package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		
		//funcoes pequenas tem um grande poder de reutilização, vale muito a pena
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		UnaryOperator<Integer> divideDois = n -> n / 2;
		
		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado)
				.andThen(divideDois).apply(2);
		
		System.out.println(resultado1);
		
		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois)
				.compose(divideDois).apply(2);
		System.out.println(resultado2);
		}

}
