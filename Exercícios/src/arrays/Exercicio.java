package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double [3];
		notasAlunoA [0] = 7.9;
		notasAlunoA [1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(notasAlunoA[0]);
		//ou
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for (int i = 0; i<3/*ou usar notasAlunoA.lenght*/; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println("media do aluno: " + total / 3);
		
		//outra maneira de adicionar elementos no array
		
		double[] notasAlunoB = { 2, 4.5, 5.9, 10 };
		for (int i = 0; i < notasAlunoB.length; i++) {
			
		}
	}

}
