package Exceção.PersonalizadaB;

@SuppressWarnings("serial")
public class NumeroNegativoException extends Exception{

	private String nomeDoAtributo;
	
	public NumeroNegativoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O Atributo %s está negativo", nomeDoAtributo);
	}	
	
}
