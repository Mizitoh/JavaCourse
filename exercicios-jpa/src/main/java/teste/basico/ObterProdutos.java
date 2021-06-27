package teste.basico;

import java.util.List;

import Infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {
	
	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto : produtos) {
			System.out.println("Produto n°: "
								+ produto.getId()
								+ ", nome: "
								+ produto.getNome()
								+ ". custa: "
								+ produto.getPreco());
		}
		
		double precoTotal = produtos.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t, p) -> t + p)
				.doubleValue();
		
		System.out.println("Valor total: R$" + precoTotal);
		
		dao.fechar();
	}

}
