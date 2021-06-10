package classe;

public class AreaCirc {
	double raio;
	static double pi;
	
	public AreaCirc(double raioInicial) {
		pi = 3.14;
		raio = raioInicial;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return pi * Math.pow(raio, 2);
	}
}
