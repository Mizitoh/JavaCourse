package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<String>(); desta forma imprime fora de ordem
		SortedSet<String> lista = new TreeSet<>(); // imprime ordenado
		lista.add("ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro");
		lista.add("maria");
		//Set<String> lista = new HashSet<>(); pode não repetir o tipo no 
		//segundo diamente :p
		
		for(String candidato: lista) {
			System.out.println(candidato); 
		}
	}
}
