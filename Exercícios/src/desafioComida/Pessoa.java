package desafioComida;

public class Pessoa {
	
	String nome;
	double peso;
	
	/* my solution
	public double comer(double peso) {
		return this.peso + peso;
	}
	*/
	
	// Professor fez com construtores
	
	Pessoa (String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.pesocomida;
		}
	}
	
}
