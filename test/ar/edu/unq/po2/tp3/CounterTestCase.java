package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {

	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	counter = new Counter();
	//Se agregan los numeros. Un solo par y nueve impares
	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(4);
	counter.addNumber(4);
	}
	/**
	* Verifica la cantidad de impares
	*/
	@Test
	public void testNumerosImpares() {
	
	int amount = counter.contarImpares();
	
	assertEquals(5, amount);
	}
	
	@Test
	public void testNumerosPares() {
	
	int amount = counter.contarPares();
	
	assertEquals(2, amount);
	}
	
	@Test
	public void testNumerosMultiplos() {
	
	int amount = counter.contarMultiplos(3);
	
	assertEquals(2, amount);
	}
	
}
