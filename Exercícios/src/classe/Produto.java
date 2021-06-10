package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	Produto(){
		//construtor padrão, pode ter corpo, mas não parametros
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
	
	não vai receber parametros pq as variaveis já existem na classe
	
	*/
	
	double precoComDesconto() {
		return (preco*(1-desconto));
	}
	
	String obterProdutoFormatado() {
		return String.format("%s / %f / %f",nome,preco,desconto);
	}
}
