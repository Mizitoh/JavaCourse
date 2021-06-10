package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Principe");
		livros.push("Don quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); // exibe o hobbit devido o contexto de lifo
		System.out.println(livros.element());
		
		System.out.println(livros.remove()); //remove o hobbit pelo mesmo motivo
		System.out.println(livros.poll());
		System.out.println(livros.pop()); // também remove, acabou exception
		System.out.println(livros.isEmpty());
		
		
		
	}

}
