package OO.Abstract;

public class Cachorro extends Mamifero{

	
	//mais especifico, porem nessa classe concreta, herda-se o mover e o respirar
	@Override
	public String mamar() {
		return "Usando leite das tetinhas da mam�e";
	}
	
	// sobrescrevendo metodo e deixando mais especifico
	
	@Override
	public String mover() {
		// acrescentei informa�ao vinda do metodo
		return super.mover() + " usando as patas";
	}	
	
}
