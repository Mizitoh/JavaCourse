package classe;

public class ProdutoTeste {
public static void main(String[] args) {
	Produto p1 = new Produto();
	p1.nome = "Notebook";
	p1.preco = 2500.00;
	p1.desconto = 0.25;
	
	var p2 = new Produto("Celular", 1000, 0.30);
	
	System.out.println(p1.nome);
	System.out.println(p2.nome);
	System.out.println("Valor do " + p1.nome  + " é: " + (p1.preco* (1 - p1.desconto)));
	System.out.println("valor é: "+ p1.preco);
	
	Produto p3 = new Produto(); 
	
	double finalPrice = p2.precoComDesconto();
	System.out.println(p1.obterProdutoFormatado());
	System.out.println(p2.obterProdutoFormatado());
	System.out.println(p3.obterProdutoFormatado());
	System.out.println(finalPrice);
}
}
