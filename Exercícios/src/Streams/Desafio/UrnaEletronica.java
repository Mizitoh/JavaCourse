package Streams.Desafio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class UrnaEletronica {
	
	public static void main(String[] args) {
		
		Candidato c1 = new Candidato(1, "Lula", "12");
		Candidato c2 = new Candidato(2, "FHC", "45");
		Candidato c3 = new Candidato(3, "Bozo", "17");
		Candidato c4 = new Candidato(4, "Genro", "20");
		
		c1.adicionarVoto(1, 1);
		c1.adicionarVoto(1, 1);
		c1.adicionarVoto(1, 1);
		c1.adicionarVoto(1, 1);
		c1.adicionarVoto(1, 1);
		c1.adicionarVoto(1, 1);
		c1.adicionarVoto(1, 1);
		
		c2.adicionarVoto(2, 1);
		c2.adicionarVoto(2, 1);
		c2.adicionarVoto(2, 1);
		c2.adicionarVoto(2, 1);
		c2.adicionarVoto(2, 1);
		c2.adicionarVoto(2, 1);
		c2.adicionarVoto(2, 1);
		c2.adicionarVoto(2, 1);
		c2.adicionarVoto(2, 1);
		
		c3.adicionarVoto(3, 1);
		c3.adicionarVoto(3, 1);
		c3.adicionarVoto(3, 1);
		
		c4.adicionarVoto(4, 1);
		c4.adicionarVoto(4, 1);
		c4.adicionarVoto(4, 1);
		
		Comparator<Candidato> maisVotado = (cand1, cand2) ->{
			if(cand1.somarVotos() > cand2.somarVotos()) return 1;
			if(cand1.somarVotos() < cand2.somarVotos()) return -1;
			return 0;
		};
		
		List<Candidato> candidatos = Arrays.asList(c1, c2, c3, c4);
		
		Function<Candidato, Integer> pegarVotos = vt -> vt.somarVotos();
		candidatos.stream().map(pegarVotos).forEach(System.out::println);
		
		BinaryOperator<Integer> somarVotosValidos = (a, b) -> a + b;
		
		candidatos.stream().map(pegarVotos).reduce(somarVotosValidos)
						   .ifPresent(System.out::println);
		
		//Predicate<Candidato> aprovado = ap -> ap.somarVotos() >= 5;
		Function<Candidato, String> Vencedor = vc -> "Parabéns " + vc.nome + " Você é o vencedor com " +vc.somarVotos()+ " votos!";
		
		System.out.println(candidatos.stream().max(maisVotado).map(Vencedor).get());
		
		//melhorar isso
	}

}
