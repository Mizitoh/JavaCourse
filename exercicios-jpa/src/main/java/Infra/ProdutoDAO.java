package Infra;

import modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto>{
	
	// criar metodos especificos de produto, um desconto por exemplo.
	
	public ProdutoDAO() {
		super(Produto.class);
	}

}
