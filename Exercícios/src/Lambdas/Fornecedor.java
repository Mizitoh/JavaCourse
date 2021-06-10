package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
		
		
		// recebe algo e não retorna nada!!
		
		Supplier<List<String>> umaLista = (/*vazio pq nao recebe nada*/) -> Arrays.asList("Ana", "Bia", "jao", "Gui");
		System.out.println(umaLista.get());
	}

}
