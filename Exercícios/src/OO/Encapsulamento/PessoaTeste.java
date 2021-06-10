package OO.Encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setIdade(30); // alterou a variavel, colocando um valor absurdo pra uma idade de pessoa
		
		System.out.println(p1.getIdade()); // leu o valor
	}

}
