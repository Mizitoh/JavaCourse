package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		CaixaNumero<Integer> caixa1 = new CaixaNumero<>();
		caixa1.setGuardar(1524);
		System.out.println(caixa1.getAbrir());
		
		CaixaNumero<Double> caixa2 = new CaixaNumero<>();
		caixa2.setGuardar(15.24);
		System.out.println(caixa2.getAbrir());
	}
}
