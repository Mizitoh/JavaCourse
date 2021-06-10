package Streams.Desafio;

public class Voto {
	
	int id;
	int qtdVotos;
	
	public Voto(int id, int qtdVotos) {
		this.id = id;
		this.qtdVotos = qtdVotos;
	}

	public int contar() {
		int soma = 0;
		soma += this.qtdVotos;
		return soma;
	}
}
