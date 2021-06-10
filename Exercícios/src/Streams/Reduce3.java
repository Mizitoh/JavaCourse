package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Marcos", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = alun -> alun.nota >= 7;
		Function<Aluno, Double> apenasNota = alun -> alun.nota;
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinarMedia = (m1, m2) ->Media.combinar(m1, m2);
		
		
		Media media = alunos.stream().filter(aprovado).map(apenasNota).reduce(new Media(), calcularMedia, combinarMedia);
		System.out.println("A media da turma é " + media.getValor());
		
		//que loucura!!! reveja a aula 205, para entender, se não conseguir por si só
	}

}
