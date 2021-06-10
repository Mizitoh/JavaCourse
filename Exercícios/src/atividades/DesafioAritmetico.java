package atividades;


public class DesafioAritmetico {
		public static void main(String[] args) {
			//para elevar um numero use tipo varavel = math.pow(variavel, valro do exponencial);
			
			double lin1, lin2, lin3, lin4, lin5, lin6, lin7, lin8;
			
			lin1= (1-5) * (2-7);
			lin2 = Math.pow(lin1/2, 2);
			lin3 = Math.pow(6*(3+2), 2);
			lin4 = 3 * 2;
			lin5 = lin3 / lin4;
			lin6 = Math.pow(lin5 - lin2, 3);
			lin7 = (10*10)*10;
			lin8 = lin6 / lin7;
			
			System.out.println("O valor é: " + lin8);			
		}
}
