package Exceção;

import java.util.Scanner;

public class Finally {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {			
			System.out.println(7 / entrada.nextInt());			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//ideal para casa haja um erro e mesmo assim vc precisa fechar o bd
			//mesmo que não trate a exceção o finally sera chamado
			System.out.println("Finalmente...");
			entrada.close();
		}
		
		System.out.println("fim");
	}

}
