package generics;

public class CaixaTeste {
	
	public static void main(String[] args) {
		
		CaixaComGenerics<String> caixaA = new CaixaComGenerics<>();
		caixaA.setGuardar("Segredo!");
		
		String coisaA = caixaA.getAbrir();
		System.out.println(coisaA);
		
		CaixaComGenerics<Double> caixaB = new CaixaComGenerics<>();
		caixaB.setGuardar(5.9);
		
		Double coisaB = caixaB.getAbrir();
		System.out.println(coisaB);
	}

}
