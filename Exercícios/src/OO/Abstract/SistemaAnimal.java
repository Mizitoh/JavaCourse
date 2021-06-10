package OO.Abstract;

public class SistemaAnimal {
	
	public static void main(String[] args) {
		Cachorro cao = new Cachorro();
		System.out.println(cao.respirar());
		System.out.println(cao.mover());
		System.out.println(cao.mamar());
	}

}
