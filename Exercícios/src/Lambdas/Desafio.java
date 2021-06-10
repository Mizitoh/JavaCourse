package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		double imposto = 1 + (8.5/100);
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		
		Function<Produto, Double> valorDesconto
		= valor -> p.preco*(1-p.desconto);
		UnaryOperator<Double> vImposto = preco -> preco >= 2500.00 ? (preco * imposto) : preco; // = valor -> vImposto >= 2500.00 ? vImposto * imposto : vImposto;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		Function<Double, String> arredondar = preco -> String.valueOf((String.format("%.2f", preco)));
		Function<String, String> formatar = preco -> ("R$" + preco).replace(".", ",");
		
		String preco = valorDesconto.andThen(vImposto).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
	
		System.out.println(" o preco final é: " + preco);
	}

}
