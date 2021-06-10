package OO.Heranca.Desafio;

public class Carro {

	final double VELOCIDADE_MAXIMA;
	double velocidadeAtual = 7;
	double aceleracao = 5;
	
	Carro (double velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	boolean acelerar(Carro carro) {
		if (carro.velocidadeAtual >= 7 && carro.velocidadeAtual < VELOCIDADE_MAXIMA) {
		carro.velocidadeAtual += aceleracao;
		return true;
	}else if (carro.velocidadeAtual == VELOCIDADE_MAXIMA || carro.velocidadeAtual >= VELOCIDADE_MAXIMA) {
		carro.velocidadeAtual = VELOCIDADE_MAXIMA;
		return true;
		} else return false;
	}
	
	boolean frear(Carro carro) {
		if (carro.velocidadeAtual >= 8) {
		carro.velocidadeAtual -=10;
		return true;
	}else if(carro.velocidadeAtual <= 7) {
		carro.velocidadeAtual = this.velocidadeAtual;
		return true;
	}else return false;
	}
	
	
}
