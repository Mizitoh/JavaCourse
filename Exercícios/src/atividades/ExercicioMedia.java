package atividades;

import java.util.Scanner;

public class ExercicioMedia {
	public static void main(String[] args) {
		
		System.out.println("Digite uma nota parcial: ");
		Scanner entrada = new Scanner(System.in);
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite uma segunda nota parcial: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if (media >= 7.0) {
			System.out.println("Parab�ns, voc� foi APROVADO!!!");
		} else if (media < 7 && media >= 4) { 
			System.out.println("T� de recupera��o, lerdo");
		} else {
			System.out.println("Burro, foi REPROVADO!! Vacil�o.");
		}
		
		entrada.close();
		
	}
}
