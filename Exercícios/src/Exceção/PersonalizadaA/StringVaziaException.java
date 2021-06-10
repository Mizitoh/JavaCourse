package Exceção.PersonalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{

	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O Atributo %s está vazio", nomeDoAtributo);
	}
	
	
	
}
