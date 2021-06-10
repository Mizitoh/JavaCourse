package Exceção;

public class Basico {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(7/0);			
		} catch (Exception ex) {
			System.out.println("Ocorreu um erro na conta, provavelmente vc dividiu por 0");
		}		
		
		try {
			System.out.println(7/0);			
		} catch (ArithmeticException ex) {
			System.out.println("Ih... Alguma coisa deu errada! Informe as mensagens "
					+ "abaixo ao seu desenvolvedor: " +ex.getMessage());
			
		}	
		
		System.out.println("Fim :)");
	}

}
