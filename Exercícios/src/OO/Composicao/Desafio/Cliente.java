package OO.Composicao.Desafio;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
	
	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
public double totalGasto() {
		
		double total = 0;
		
		for (Compra compra : compras) {
			total += (compra.valorCompra());
		}			
		return (total);
	}
	
	
	//
	//public double dinheiroGasto{
	//	int soma = 0;
	//	double total = 0;
	//
	//for(Compra gastos : compras) {
	//	
	//	
	//	
	//}
	//	
	//}
}
