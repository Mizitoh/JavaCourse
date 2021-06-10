package fundamentos;

public class CalculaTemperatura {
	public static void main(String[] args) {
		double fahrenheit, Valor;
		double celsius, valor2;
		final double CONST = 5/9.0;
		System.out.println("Calculando 20°C em Fahrenheit:");
		celsius = 20;
		fahrenheit = ((CONST * celsius) + 32);
		System.out.println(fahrenheit);
		System.out.println("Calculando 980 Fahrenheit em Celsius:");
		Valor = 980;
		valor2 = ((Valor-32)/CONST);
		System.out.println(valor2);
		System.out.println("Fazendo do jeito do professor");
		fahrenheit = 68;
		Valor = 32;
		celsius = (fahrenheit - Valor)*CONST;
		System.out.println(celsius);		
	}
}
