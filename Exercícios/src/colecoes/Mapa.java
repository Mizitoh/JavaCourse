package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		/*
		 * unico que não tem metodo add
		 * pq caso não exista ele inclui e altera caso o 
		 * valor do id, por exemplo, seja substituido 
		 */
		
		usuarios.put(1, "Ricardo");
		usuarios.put(1, "Leandro");
		usuarios.put(2, "Mario");
		usuarios.put(300, "Jorge");
		usuarios.put(4, "Fabio");
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Druida"));
		System.out.println(usuarios.get(300));
		System.out.println();
		System.out.println(usuarios.remove(300, "Ricardo")); //retorna null
		System.out.println();
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " >>>> ");
			System.out.println(registro.getValue());
		}
	}

}
