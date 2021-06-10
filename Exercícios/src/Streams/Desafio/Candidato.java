package Streams.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Candidato {
	
	int candidatoId;
	String nome;
	String legenda;
	List<Voto> votos = new ArrayList<>();
	
	public Candidato(int candidatoId, String nome, String legenda) {
		this.candidatoId = candidatoId;
		this.nome = nome;
		this.legenda = legenda;
	}

	public void adicionarVoto(int id, int voto) {
		this.votos.add(new Voto(id, voto));
	}
	
	public int somarVotos() {
		int total = 0;
		for (Voto qtdVoto : votos) {
			total += (qtdVoto.qtdVotos);
		}	
		return (total);
	} 
	
	@Override
	public String toString() {
		return +this.candidatoId+ ", "+ this.nome+ ", " + this.legenda +", "+ somarVotos();
	}
		
}
