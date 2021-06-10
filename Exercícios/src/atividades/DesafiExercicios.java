package atividades;

import java.util.Scanner;

public class DesafiExercicios {
	public static void main(String[] args) {
		
		System.out.println("Digite um numero");
		Scanner digitado = new Scanner(System.in);
		int num = digitado.nextInt();
		if (num <= 0 || num >= 10) {
			System.out.println("Este número não é válido, por vafor digite um dumero de 0 a 10");
		} else if (num % 2 == 0) {
			System.out.println("O numero " + num + " é um numero par.");
		} else
			System.out.println("O numero digitado é impar");
		
	
		System.out.println("Digite um ano de 4 digitos");
		num = digitado.nextInt();
		if (num % 4 == 0) {
			System.out.println("o ano: " + num + " é bissexto");
		} else System.out.println("não é um ano bissexto");
		
		digitado.close();
	}
			
}
