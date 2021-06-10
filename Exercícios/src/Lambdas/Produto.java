package Lambdas;

public class Produto {
	
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desnconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desnconto;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome + " vale: " + preco +
				" com descote de: " + desconto + 
				" sai por: " + (preco *(1-desconto));
	}

}
