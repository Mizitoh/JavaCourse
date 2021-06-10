package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Marcos", 9.2);
		Aluno a3 = new Aluno("Severina", 10.0);
		Aluno a4 = new Aluno("Judite", 4.2);
		Aluno a5 = new Aluno("Gui", 5.2);
		Aluno a6 = new Aluno("Paula", 3.9);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		Predicate<Aluno> estaAprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacao = s -> "Parabéns "+ s.nome + " Você foi aprovado(a)";
		//modo um de fazer
		//alunos.stream().filter(a -> a.nota >= 7)
		//.map( a -> "Parabéns "+ a.nome + " Você foi aprovado(a)").forEach(System.out::println);
		
		//modo dois com funções
		alunos.stream().filter(estaAprovado).map(saudacao).forEach(System.out::println);
	}

}
