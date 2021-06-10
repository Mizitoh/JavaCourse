package Streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Marcos", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Luna", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Marcos", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct... não seleciona repetidos");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit >>> pula e limita a escolha de alguns");
		alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);
		
		System.out.println("\ntake while >>> selecina o primeiro conforme sua logica");
		alunos.stream().distinct().skip(0).takeWhile(a->a.nota==a.nota).forEach(System.out::println);
	}

}
