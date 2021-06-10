package OO.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<>();
	List<Compra> compra = new ArrayList<>();
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	//metodo pra instanciar item e produto de uma vez no main
	void adicionarItemeProduto(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	//public void addCompra(Item item) {
	//	itens.add(item);
	//}
	
	public double valorCompra() {
		
		double total = 0;
		
		for (Item item : itens) {
			total += (item.quantidade * item.produto.preco);
		}			
		return (total);
	}
	
}
