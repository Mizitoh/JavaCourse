package desafioComida;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c = new Comida("Arroz", 5.200);
		Comida c1 = new Comida("Feijão", 2.200);
		
		/* Minha solução, a do professor foi com construtor, muito melhor
		c.nome = "Arroz";
		c.pesocomida = 0.200;
		
		c1.nome = "Feijão";
		c1.pesocomida = 2.300;
		*/
		
		
		Pessoa P1 = new Pessoa("Paula", 180);
		Pessoa P2 = new Pessoa("João", 190);
		
		/*
		P1.nome = "Paula";
		P1.peso = 180;
		
		P2.nome = "João";
		P2.peso = 190;
		*/
		
		System.out.println("Nome: "+ P1.nome);
		System.out.println("Peso: "+ P1.peso);
		System.out.println("Nome: "+ P2.nome);
		System.out.println("Peso: "+ P2.peso);
		
		P1.comer(c);
		
		System.out.println("Nome: "+ P1.nome);
		System.out.println("Peso: "+ P1.peso);
		
		P2.comer(c1);
		P2.comer(c);
		P2.comer(c);
		P2.comer(c1);
		
		System.out.println("Nome: "+ P2.nome);
		System.out.println("Peso: "+ P2.peso);
	}

}
