package Lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		Function<Integer, String>parOUImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		System.out.println(parOUImpar.apply(22));
		
		Function<String, String> oResultadoE = valor -> "O resultado �: " + valor;
		
		Function<String, String> empolgado = valor -> valor +"!!!!!!";
		
		 /*
		 * Deu certo pq a primeir fun��o rece int e retorna string
		 * a segunda recebe uma string (no caso a string da primeira) e retorna uma nova string
		 * a junc��o das duas.
		 * Vamos encadear mais uma fun��o. 
		 */

		
		String resultadoFinal = parOUImpar.andThen(oResultadoE).apply(51);
		System.out.println(resultadoFinal);
		
		String resultadoFinal2 = parOUImpar.andThen(oResultadoE).andThen(empolgado).apply(51);
		System.out.println(resultadoFinal2);
	}

}
