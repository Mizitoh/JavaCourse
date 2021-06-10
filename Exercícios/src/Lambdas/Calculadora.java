package Lambdas;

public class Calculadora {
	
	public static void main(String[] args) {
		
		//instanciando Calculo, estamos usando polimorfismo, onde sobrescrevemos os metodos
		//para somar e multiplicar
		//essa foi a formula trdicional
		Calculo somar = new Somar();
		Calculo multiplicar = new Multiplicar();
		Calculo dividir = new Dividir();
		
		System.out.println(somar.executar(10, 10));
		System.out.println(multiplicar.executar(10, 10));
		
		//com expressoes lambdas:
		// dispensou a criacao da classe subtrair
		
		Calculo subtrair = (x,y) -> {
			return x-y;
		};
		// mais simples
		Calculo teste = (x,y) -> x*x +y;
		
		System.out.println(teste.executar(2, 4));
		System.out.println(subtrair.executar(250, 120));
		
		System.out.println(dividir.executar(100, 2));
		
	}

}
