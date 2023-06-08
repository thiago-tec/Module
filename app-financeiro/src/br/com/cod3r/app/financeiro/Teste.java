package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

public class Teste {
	
	public static void main(String[] args) {
		
		
		Calculadora calc = ServiceLoader
				.load(Calculadora.class)//vai encontrar a implementação
				.findFirst()//primeiro que encontrar
				.get();
		System.out.println(calc.soma(2,3,4));
		
//		OperacoesAritimeticas op = new OperacoesAritimeticas();
//		System.out.println(op.soma(4,5,6));
		
		
		try {
			Field fieldID = calc.getClass().getDeclaredFields() [1];
			fieldID.setAccessible(true);
			fieldID.set(calc, "def");
			fieldID.setAccessible(false);
			
			System.out.println(calc.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		

//		System.out.println(Calculadora.class.getDeclaredFields() [1].getName());
		
	}

}
