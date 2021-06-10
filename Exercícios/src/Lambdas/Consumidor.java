package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

public class Consumidor {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caneta", 4, 0.09);
		Consumer<Produto> imprimir = prod -> System.out.println(prod.nome);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Lapis", 1.50, 0.09);
		Produto p3 = new Produto("Skate", 40.99, 0.09);
		Produto p4 = new Produto("Calção", 20.45, 0.09);
		Produto p5 = new Produto("Esconderijo", 4, 0.09);
		
		//Podemos usar o consumer para o foreach
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		produtos.forEach(p ->System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
