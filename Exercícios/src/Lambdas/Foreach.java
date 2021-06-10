package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nForma lambdas #1");
		aprovados.forEach(nome -> System.out.println(nome + " !"));
		
		System.out.println("\nMethod Reference:");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nForma lambdas #2 adicionando "+"valores"+" no m�todo");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference 2:");
		aprovados.forEach(Foreach/*nome da classe*/::meuImprimir);
				
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome �: " + nome + " e fui aprovado(a)");
	}

}
