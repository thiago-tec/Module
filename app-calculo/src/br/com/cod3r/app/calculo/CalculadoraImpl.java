package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritimeticas;
import br.com.cod3r.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {
	
	private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

	private String id = "abc"; 
	
	public double soma(double... nums) {
		Logger.info("somando...");
		return opAritimeticas.soma(nums);
	}

	public String getId() {
		return id;
	}
	
}
