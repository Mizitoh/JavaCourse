package generics;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.setGuardar(2.3);
		
		//dar� uma excess�o pq n�o � poss�vel converter do whraper Double para Integer
		
		//Integer coisa = (Integer) caixaA.getAbrir();
		
		//com casting sempre teremos que passar object para um item espec�fico
		//� arriscado
		
		Double coisa = (Double) caixaA.getAbrir();
		
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		
		caixaB.setGuardar("Ol�");
		
		String coisaB = (String) caixaB.getAbrir();
		
		System.out.println(coisaB);
	}

}
