package OO.Abstract;

public class Cachorro extends Mamifero{

	
	//mais especifico, porem nessa classe concreta, herda-se o mover e o respirar
	@Override
	public String mamar() {
		return "Usando leite das tetinhas da mamãe";
	}
	
	// sobrescrevendo metodo e deixando mais especifico
	
	@Override
	public String mover() {
		// acrescentei informaçao vinda do metodo
		return super.mover() + " usando as patas";
	}	
	
}
