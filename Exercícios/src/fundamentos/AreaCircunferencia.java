package fundamentos;

import java.util.Scanner;

public class AreaCircunferencia {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		final double PI = 2.14; //final define constante
		// A convenção de codigos sugere que const sejam escritas em maiusculas
		double raio;
		double area; 
		System.out.println("Digite o valor do raio da circunferencia");
		raio = leitura.nextDouble();
		area = raio*raio*PI;
		System.out.println("A area é: " + area);
		leitura.close();
	}
}
