package generics;

public class CaixaComGenerics<TIPO> {
	/*
	 * esse exercicio vai ter um objeto generico usando generics
	 */

	private TIPO coisa;
	
	public void setGuardar(TIPO coisa) {
		this.coisa = coisa;
	}
	
	public TIPO getAbrir() {
		return coisa;
	}
}
