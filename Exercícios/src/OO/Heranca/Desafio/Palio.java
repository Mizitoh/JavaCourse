package OO.Heranca.Desafio;

public class Palio extends Carro implements Esportivo{

	Palio (){
		super(500); // padrao, se não passar atributo assume 500
	}
	
	Palio (double vm){
		super(vm); // caso passe um valor diferente do padrão, cria esse construtor. show
				   // modelo ideal é dessa classe.
	}
	
	@Override
	public void ligarTurbo() {
		super.aceleracao = 30;
		
	}
	
	@Override
	public void desligarTurbo() {
		super.aceleracao = 5;
		
	}
	
	//@Override
	//boolean acelerar(Carro carro) {
	//	// TODO Auto-generated method stub
	//	carro.velocidadeAtual +=310;
	//	return super.acelerar(carro);
	//}
}
