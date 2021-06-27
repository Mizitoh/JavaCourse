package br.com.mike.app.calculo;

import br.com.mike.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

	private OperacoesAritmeticas apAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		return apAritmeticas.soma(nums);
	}
}
