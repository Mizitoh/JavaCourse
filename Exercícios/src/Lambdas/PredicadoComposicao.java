package Lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPair = num -> num % 2 == 0;
		Predicate<Integer> hasThreeValue = num -> num >= 100 && num <=999;
		
		System.out.println(isPair.test(65));
		System.out.println(isPair.and(hasThreeValue.negate()).test(22));
		
		//se não entender reveja a aula 179
	}

}
