package atividades;

import java.util.Scanner;


public class DesafioCalculadora {
	public static void main(String[] args) {
	double num1, num2;
	
	System.out.println("Digite um numero:");
	
	Scanner entrada = new Scanner(System.in);
	
	num1 = Double.parseDouble(entrada.nextLine());
	
	System.out.println("Digite outro numero:");

	num2 = Double.parseDouble(entrada.nextLine());
	
	System.out.println("Digite o simbolo de uma operaão matemática + - * / ou %s: ");

	String operacao = entrada.nextLine().toString().toLowerCase().trim();

	double resultado = "+".equals(operacao) ? num1 + num2 : 0;
	resultado = "-".equals(operacao) ? num1 - num2 : resultado;
	resultado = "*".equals(operacao) ? num1 * num2 : resultado;
	resultado = "/".equals(operacao) ? num1 / num2 : resultado;
	resultado = "%".equals(operacao) ? num1 % num2 : resultado;
	
	System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);

	
	
	entrada.close();
	
}
}
