package OO.Abstract;

public abstract class Mamifero extends Animal{

	
	//tamb�m muito generico, mas pra ilustrar vamos seguir assim
	@Override
	public String mover() {
		return "Saindo do lugar";
	}
	
	//tamb�m muito generico
	public abstract String mamar();
	
}
