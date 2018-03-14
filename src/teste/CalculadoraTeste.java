package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Calculadora;

/* CLASSE DE TESTES */
public class CalculadoraTeste {
	
	@Test
	public void deveSomarDoisValoresPassados(){
		int a = 4;
		int b = 2;
		int soma, subtrai, divide;
		
		Calculadora calculadora = new Calculadora();
		soma = calculadora.soma(a, b);
		subtrai = calculadora.subtrai(a, b);
		divide = calculadora.divide(a, b);
		
		assertEquals(2, divide);
	}
	
	
	@Test(expected = ArithmeticException.class)
	public void deveLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero(){
		int a = 4;
		int b = 0;
		int soma, subtrai, divide;
		
		Calculadora calculadora = new Calculadora();
		soma = calculadora.soma(a, b);
		subtrai = calculadora.subtrai(a, b);
		divide = calculadora.divide(a, b);
		
		assertEquals(0, divide);
	}
}
