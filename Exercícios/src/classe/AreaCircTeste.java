package classe;

public class AreaCircTeste {
public static void main(String[] args) {
	AreaCirc a = new AreaCirc(5);
	//a.pi = 10;
	System.out.println(a.area());
	
	AreaCirc a2 = new AreaCirc(5);
	System.out.println(a2.area());
	
	System.out.println(AreaCirc.area(100));
	
	//exemplo para ilustrar apenas, pois é possivel usar math.pi para o valor de pi
	// static prende a variavel na classe
	// final static prende uma constante na classe
}
}
