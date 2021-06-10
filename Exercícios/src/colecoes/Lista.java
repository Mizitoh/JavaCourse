package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		// outra maneira de adicionar, mais facil na minha opiniao
		
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Joana"));
		lista.add(new Usuario("Nata"));
		lista.add(new Usuario("Dudu"));
		lista.add(new Usuario("Bob"));
		lista.add(new Usuario("Ervilha"));
		lista.add(new Usuario("Mariana"));
		lista.add(new Usuario("Mariana"));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		System.out.println(lista.get(4));
		System.out.println(lista.get(2));
		
		lista.remove(7); // ou podemos usar uma instancia de usuario no lugar
						// desse numero que é o index
		
		System.out.println(lista);
		System.out.println(lista.contains(u1));
		System.out.println(lista.contains(new Usuario("Ervilha")));
		
		//arraylist não usam hascode e nem equals, portanto se eu deletar o metodo
		// equals e hashcode, o codigo continuara funcionando
		
	}

}
