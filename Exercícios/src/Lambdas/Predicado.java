package Lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		Predicate<Produto> isExpansive = prod -> (prod.preco * (1 - prod.desconto) ) >= 300;
		Produto produto = new Produto("Caderno", 580.35, 0.15);
		
		System.out.println(isExpansive.test(produto));
	}

}
