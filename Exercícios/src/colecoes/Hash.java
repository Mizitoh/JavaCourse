package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		usuarios.add(new Usuario("Maria"));
		usuarios.add(new Usuario("Joana"));
		usuarios.add(new Usuario("Nata"));
		usuarios.add(new Usuario("Dudu"));
		usuarios.add(new Usuario("Bob"));
		usuarios.add(new Usuario("Ervilha"));
		usuarios.add(new Usuario("Mariana"));
		
		boolean resultado = usuarios.contains(new Usuario("Mariana"));
		System.out.println(resultado);
	}

}
