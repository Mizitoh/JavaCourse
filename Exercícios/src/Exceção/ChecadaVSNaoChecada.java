package Exce��o;

public class ChecadaVSNaoChecada {
	
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (Exception e) {
			// decidi tratar essa exce��o, mas n�o era obrigado
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			// aqui sou obrigado a tratar
			System.out.println(e.getMessage());
		}
		
		System.out.println("fim :)");
		
	}
	
	//n�o checada ou n�o verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	}
	
	//exce��o checada ou verificada, sendo assim o java me for�a a colocar o throws Exception
	// alem do throw e me obria a tratar a exce��o
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal #02!");
	}

}
