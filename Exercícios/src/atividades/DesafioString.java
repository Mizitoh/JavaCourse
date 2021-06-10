package atividades;

import java.util.Scanner;

public class DesafioString {
	public static void main(String[] args) {
		String valor1, valor2, valor3;
		double sal1, sal2, sal3, media;
		
		System.out.println("Digite o primeiro salarário: ");
		Scanner entrada = new Scanner(System.in);
		valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salarário: ");
		valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salarário: ");
		valor3 = entrada.nextLine().replace(",", ".");
		
		sal1 = Double.parseDouble(valor1);
		sal2 = Double.parseDouble(valor2);
		sal3 = Double.parseDouble(valor3);
		
		media = (sal1 + sal2 + sal3) / 3;
		
		System.out.println("A maedia salarial é: " + media);
		entrada.close();
	}

}
