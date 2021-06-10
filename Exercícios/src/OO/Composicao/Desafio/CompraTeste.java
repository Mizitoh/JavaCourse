package OO.Composicao.Desafio;

public class CompraTeste {
	public static void main(String[] args) {
		
		//fracassei no exercício;
		
		Cliente cli1 = new Cliente("Marcos");
				
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		Produto p1 = new Produto("carro", 10);
		Produto p2 = new Produto("moto", 10);
		Produto p3 = new Produto("barco", 10);
				
		compra1.adicionarItemeProduto("Jato", 15000, 1);
		compra1.adicionarItem(p1, 2);
		compra1.adicionarItem(new Produto("Bicicleta", 510.78), 1);
		
		compra2.adicionarItemeProduto("Jato", 15000, 5);
		compra2.adicionarItem(p1, 2);
		compra2.adicionarItem(p2, 1);
		compra2.adicionarItem(p3, 100);
		
		/* o ideal era ter um metodo para adicionar compra
		 * para isso bastaria adicionar um metodo na classe cliente:
		 * void adicionarCompra(Compra compras){
		 * this.compra = compras;
		 * }
		 * 
		 * no main seria
		 * 
		 * cli1.adicionarCompra(compra1);
		 */
		
		cli1.compras.add(compra1);
		cli1.compras.add(compra2);
		
		System.out.println(cli1.totalGasto());
	}

}
