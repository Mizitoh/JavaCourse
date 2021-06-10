package Exceção.PersonalizadaA;

import Exceção.Aluno;

public class TestarValidacoes {
	
	public static void main(String[] args) {
		
		
		
		try {
			Aluno aluno = new Aluno("Ana", 2);
			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (NumeroNegativoException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("fim :)");
	}

}
