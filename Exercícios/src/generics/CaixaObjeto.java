package generics;

public class CaixaObjeto {
	
	/*
	 * esse exercicio vai ter um objeto generico sem usar generics
	 */

	private Object coisa;
	
	public void setGuardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object getAbrir() {
		return coisa;
	}
}
