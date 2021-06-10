package OO.Encapsulamento;

public class Pessoa {
	
	private int idade;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		try { 
			if (idade >= 0 && idade <= 120) {
			this.idade = idade;
		}	else System.out.println("Idade não pode ser numero negaivo");		
		} catch (Exception e) {
			
		}
	}
	// podemos usar os metodos get and set nos construtores.
	
	
	

}
