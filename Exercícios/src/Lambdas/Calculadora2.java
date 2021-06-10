package Lambdas;

import java.util.function.BinaryOperator;

public class Calculadora2 {
	
	public static void main(String[] args) {
		
		/*
		 * Note que � o whrap Double e nao um simples double
		 * por esso motivo, n�o � possivel aplicar numeros sem ponto flutuante 10,0 por ex
		 * Com o binary operator, n�o precisamos de uma interface Calculo
		 */
		BinaryOperator<Double> somar = (x,y) -> {return x + y;};
		
		System.out.println(somar.apply(10.0, 10.0));
		
		BinaryOperator<Integer> calcular = (x,y) -> {return x * y;};
		
		System.out.println(calcular.apply(10, 10));
	}

}
