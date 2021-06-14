package br.com.mike.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	
	public Calculadora(){
		
		organizarLayout();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(232, 322);
		setLocationRelativeTo(null);
	}
	
	private void organizarLayout() {
		/* ha um tipo de gerenciador de layato chamado border layout
		 * ele define a tela em norte sul lest oeste
		 * e centro
		 */
		setLayout(new BorderLayout());
		
		Display display = new Display();
		add(display, BorderLayout.NORTH);
		display.setPreferredSize(new Dimension(233,60));
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Calculadora();
		
	}

}
