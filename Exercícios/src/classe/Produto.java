package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	Produto(){
		//construtor padr�o, pode ter corpo, mas n�o parametros
		nome= "padrao";
		preco = 1;
		desconto = 0.50;
	}
	
	Produto(String nome, double preco, double desconto){
		//construtor com parametro
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	/*double precoComDesconto(double preco, double desconto) {
		return (preco*(1-desconto));
	}
	
	n�o vai receber parametros pq as variaveis j� existem na classe
	
	*/
	
	double precoComDesconto() {
		return (preco*(1-desconto));
	}
	
	String obterProdutoFormatado() {
		return String.format("%s / %f / %f",nome,preco,desconto);
	}
}
