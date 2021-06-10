package Exce��o.PersonalizadaB;

import Exce��o.Aluno;

public class TestarValidacoes {
	
	public static void main(String[] args) {
		
		/*
		 * quando as exce��es estedem de Exceptions torna obrigatorio acrescentar
		 * trhown na instancia��o da classe e tratar as exce��es
		 */
		
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
