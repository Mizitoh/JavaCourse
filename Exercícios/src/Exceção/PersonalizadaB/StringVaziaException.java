package Exce��o.PersonalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception{

	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O Atributo %s est� vazio", nomeDoAtributo);
	}
	
	
	
}
