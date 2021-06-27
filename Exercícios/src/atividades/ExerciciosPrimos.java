package atividades;


import java.util.Scanner;

public class ExerciciosPrimos {
	public static void main(String[] args) {
		
		System.out.println("Digite um numero");
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		double primo;
		int contador = 0;
		
		for (int i=1; i<=numero; i++) {
			primo = numero%i;
			
			if (primo == 0)
			contador = contador + 1;
		}
		
		if (contador == 2) {
			System.out.println("O numero: " + numero + " é primo");
		} else {
			System.out.println("O numero: " + numero + " não é primo");
		}
	entrada.close();	
	}
}
