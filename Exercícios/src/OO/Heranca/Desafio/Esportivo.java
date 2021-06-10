package OO.Heranca.Desafio;

public interface Esportivo {
	
	void ligarTurbo();
	void desligarTurbo();
	
	//apenas uma dica de metodo default em interface que não será obrigatoria a implementação
	default int turbo() {
		return 1;
	}

}
