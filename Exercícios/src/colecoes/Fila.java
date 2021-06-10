package colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana");
		fila.offer("Bia");
		/*caso a lista seja limitada, add dar� uma exception
		* offer retorna true or false caso n�o caiba na fila.
		* esse comportamentos s�o para caso a fila esteja cheia.
		*/
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); // se a fila estiver vazia retorna nullo
		System.out.println(fila.peek());
		System.out.println(fila.element()); // se a fila estiver vazia retorna exception
		
		/*
		 * fila.size();
		 * .clear();
		 * .isEmpty();
		 * fila.contains(...);
		 */
		System.out.println(fila.poll()); // remove elemento da fila, quando acabar retorna nullo
		System.out.println(fila.remove()); // retira item, mas quando acaba, exce��o.
		System.out.println(fila);
	}

}
