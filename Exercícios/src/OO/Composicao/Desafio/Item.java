package OO.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {
	final int quantidade;
	//List<Produto> produto = new ArrayList<>();
	final Produto produto;
	
	List<Compra> compra = new ArrayList<>();
	
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}

	//public void addProduto(Produto p) {
	//	produto.add(quantidade, p);
	//}

	//
	//public double somaPrecoTotal() {
	//	double soma = 0;
	//	for(Produto total : this.produto) {
	//		soma += total.preco;
	//	}
	//	return soma;
	//}
	
}
