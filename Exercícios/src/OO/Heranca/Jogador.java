package OO.Heranca;

public class Jogador {
	
	//posicao
	int vida =100;
	int x;
	int y;
	
	//aula construtores
	
	public Jogador() {
		this (0,0);
	}
	
	public Jogador(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//metodo para ataque
	
	

	void ataque(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.y);
		int deltaY = Math.abs(y - oponente.x);
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -=10;
		} else if (deltaX == 1 && deltaY == 0) {
		oponente.vida -= 10;
		}
	}	
	

	// metodo para saber se o jagador andou
	
	boolean andar(Direcao direcao) {
		
		switch (direcao) {
		case NORTE: 
			y--;
			break;
		case SUL: 
			y++;
			break;
		case LESTE: 
			x++;
			break;
		case OESTE: 
			x--;
			break;
		}
		
		//if (direcao == "norte") {
		
		// meu if é o de cima, mas vou seguir o do professor
		
		//if ("norte".equalsIgnoreCase(direcao)) {
		
		// If com enum
		
		//if (direcao == Direcao.NORTE) {
		//	y++;
		//}
		return true;
	}

}
