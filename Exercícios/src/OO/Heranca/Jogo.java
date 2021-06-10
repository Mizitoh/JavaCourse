package OO.Heranca;

public class Jogo {
	
	//aqui inicia o jogo, instancia os jogadores
	
	public static void main(String[] args) {
		//Jogador play1 = new Jogador();
		//Jogador play2 = new Jogador();
		
		//contrutor com argumentos criado na classe heroi
		Heroi play1 = new Heroi(10, 10);
		Monstro play2 = new Monstro();
		
		//play1.x = 10;
		//play1.y = 10;
		
		play2.x = 10;
		play2.y = 11;
		
		play1.ataque(play2);
		play2.ataque(play1);
		play2.ataque(play1);
		
		System.out.println(play2.vida);
		System.out.println(play1.vida);
		
		
		/*
		//posição do jogador no tabuleiro inicial
		play1.x = 10;
		play1.y = 20;
		
		play1.andar(Direcao.NORTE);
		play1.andar(Direcao.NORTE);
		play1.andar(Direcao.NORTE);
		play1.andar(Direcao.NORTE);
		play1.andar(Direcao.LESTE);
		play1.andar(Direcao.LESTE);
		play1.andar(Direcao.LESTE);
		play1.andar(Direcao.LESTE);
		play1.andar(Direcao.LESTE);
		play1.andar(Direcao.LESTE);
		play1.andar(Direcao.OESTE);
		play1.andar(Direcao.OESTE);
		play1.andar(Direcao.OESTE);
		play1.andar(Direcao.OESTE);
		play1.andar(Direcao.OESTE);
		play1.andar(Direcao.SUL);
		play1.andar(Direcao.SUL);
		play1.andar(Direcao.SUL);
		play1.andar(Direcao.SUL);
		play1.andar(Direcao.SUL);
		play1.andar(Direcao.SUL);
		play1.andar(Direcao.SUL);
		play1.andar(Direcao.OESTE);
		play1.andar(Direcao.NORTE);
		play1.andar(Direcao.NORTE);
		play1.andar(Direcao.NORTE);
		play1.andar(Direcao.NORTE);
		play1.andar(Direcao.NORTE);
		play1.andar(Direcao.NORTE);
		play1.andar(Direcao.NORTE);
		
		
		System.out.println(play1.y);
		System.out.println(play1.x);
		
		*/
	}

}
