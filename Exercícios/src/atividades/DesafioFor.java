package atividades;


public class DesafioFor {
	public static void main(String[] args) {
		String valor = "#";
		
		for (String conta= ""; !conta.equals("!!!!!!"); conta +="!") {
			System.out.println(valor);
			valor += "#";
		}
	}
}
