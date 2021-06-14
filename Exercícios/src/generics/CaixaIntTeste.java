package generics;

public class CaixaIntTeste {
	
public static void main(String[] args) {
		
		CaixaInt<Integer> caixaA = new CaixaInt<>();
		caixaA.setGuardar(123);
		
		Integer coisaA = caixaA.getAbrir();
		System.out.println(coisaA);
		
		CaixaInt<Integer> caixaB = new CaixaInt<>();
		caixaB.setGuardar(6);
		
		Integer coisaB = caixaB.getAbrir();
		System.out.println(coisaB);
	}

}
