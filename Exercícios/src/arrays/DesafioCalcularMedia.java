package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioCalcularMedia {
public static void main(String[] args) {
	System.out.println("Vamos calcular a media? \n");
	System.out.println("Quantas notas você quer adicionar?");
	
	Scanner entrada = new Scanner(System.in);
	int qtd = entrada.nextInt();
	double[] notas = new double[qtd];
	double media = 0;
	
	for (int i=0; i<notas.length; i++) {
		System.out.println("Digite a nota " + (i + 1) +":");
		notas[i] = entrada.nextDouble();
		//media += notas[i];
	}
	
	// professor pediu um outro laço pra calcular media
	for (double mediaprof: notas) {
		media += mediaprof;
	}
	
	System.out.println(Arrays.toString(notas));
	
	System.out.println("A media é: " + (media/qtd));
	
	entrada.close();
	
}
}
