package Exce��o.PersonalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{

	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O Atributo %s est� vazio", nomeDoAtributo);
	}
	
	
	
}
