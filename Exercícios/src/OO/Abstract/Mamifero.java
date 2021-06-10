package OO.Abstract;

public abstract class Mamifero extends Animal{

	
	//também muito generico, mas pra ilustrar vamos seguir assim
	@Override
	public String mover() {
		return "Saindo do lugar";
	}
	
	//também muito generico
	public abstract String mamar();
	
}
