package atividades;

import java.util.Scanner;

public class desafioSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int referencia;
		
		System.out.println("Digite um dia da semana:");
		String dia = entrada.nextLine().toString().toLowerCase();
		
		if (dia.equals("segunda")||dia.equals("segunda-feira")) {
			referencia = 2;
			System.out.println(referencia);
			//aletração para tratar a string
		} else if (dia.equals("terça")) {
			referencia = 3;
			System.out.println(referencia);
		} else if (dia.equals("quarta")) {
			referencia = 4;
			System.out.println(referencia);
		} else if (dia.equals("quinta")) {
			referencia = 5;
			System.out.println(referencia);
		} else if (dia.equals("sexta")) {
			referencia = 6;
			System.out.println(referencia);
		} else if (dia.equals("sabado")) {
			referencia = 7;
			System.out.println(referencia);
		} else if (dia.equals("domingo")) {
			referencia = 1;
			System.out.println(referencia);
		} else {
			System.out.println("dia invalido, tente digitar sem a palavra feira");
		} entrada.close();
	}
}
