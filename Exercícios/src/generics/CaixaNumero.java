package generics;

public class CaixaNumero<N extends Number> extends CaixaComGenerics<N> {
	
	//como vem de number, trata o generico como qualquer numere
	//float, double...
	// não pode esquecer de setar o parametro tipo que no caso aqui foi n na outra extends

}
