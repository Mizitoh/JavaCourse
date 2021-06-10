package OO.Heranca.Desafio;

public interface Esportivo {
	
	void ligarTurbo();
	void desligarTurbo();
	
	//apenas uma dica de metodo default em interface que n�o ser� obrigatoria a implementa��o
	default int turbo() {
		return 1;
	}

}
