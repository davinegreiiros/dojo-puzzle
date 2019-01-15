package dojo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Contador_teste {

	@Test
	public void ContarUnidadeNumeroUnidade () {
		Contador cont1 = new Contador();
		int resultado = cont1.numero(1);  
		assertEquals(2, resultado);
		//numero 1 = 2 caracter 
	}
	@Test
	public void ContarDezenaNumeroDezena () {
		Contador cont2 = new Contador();
		int resultado = cont2.numero(18);
		assertEquals(6, resultado);
		//numero 18 = 2+4 = 6 caracter
	}

	@Test
	public void ContarNumeroCentena () {
		Contador cont3 = new Contador();
		int resultado = cont3.numero(130);
		assertEquals(10, resultado);
		// numero 130 = 2+4+4 = 10 caracter
	}
	
	@Test
	public void ContarNumeroMil () {
		Contador cont4 = new Contador();
		int resultado = cont4.numero(1000);
		assertEquals(14, resultado);
		// numero 1000 = 2+4+4+4 = 14 caracter 
	}
	@Test
	public void acumulador () {
		Contador contador = new Contador();
		int resultado = contador.acumula(11);
		assertEquals(47, resultado);
	 
	}

	
	
	
	
}
