package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Ana", "Maria", "Ju");
		
		for (String nomes : aprovados) {
			System.out.println(nomes);
		}
		
		System.out.println("\nusando iterator");
		
		Iterator<String> iterator =aprovados.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\ncom stream");
		
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); //laço interno
	}
}
