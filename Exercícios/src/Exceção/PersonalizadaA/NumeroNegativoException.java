package Exce��o.PersonalizadaA;

@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException{

	private String nomeDoAtributo;
	
	public NumeroNegativoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O Atributo %s est� negativo", nomeDoAtributo);
	}	
	
}
