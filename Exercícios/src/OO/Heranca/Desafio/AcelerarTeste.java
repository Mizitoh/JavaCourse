package OO.Heranca.Desafio;

public class AcelerarTeste {
	
	public static void main(String[] args) {
		Palio palio = new Palio();
		System.out.println(palio.velocidadeAtual);
		palio.ligarTurbo();
		palio.acelerar(palio);
		palio.acelerar(palio);
		palio.acelerar(palio);
		palio.acelerar(palio);
		palio.desligarTurbo();
		
		System.out.println(palio.velocidadeAtual);
		
		palio.frear(palio);
		palio.frear(palio);
		palio.frear(palio);
		
		System.out.println(palio.velocidadeAtual);
		
		Uno uno = new Uno(100);
		uno.acelerar(uno);
		uno.acelerar(uno);
		uno.acelerar(uno);
		uno.acelerar(uno);
		
		System.out.println(uno.velocidadeAtual);
		
		uno.frear(uno);
		uno.frear(uno);
		uno.frear(uno);
		
		System.out.println(uno.velocidadeAtual);
	}

}
