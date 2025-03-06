package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	@Test
	void testSumar() {
		Calculadora calculadora = new Calculadora();
		assertEquals(11,calculadora.sumar(5, 6));
	}


@Test
void testSumaNull() {
	Calculadora calculadora = new Calculadora();
	assertEquals(0,calculadora.sumar(null, 6));
}

@Test
void testSumaNull2() {
	Calculadora calculadora = new Calculadora();
	assertEquals(0,calculadora.sumar(4, null));
}

@Test
void testRestar() {
	Calculadora calculadora = new Calculadora();
	assertEquals(1,calculadora.restar(6, 5));
}

@Test
void testRestaNull() {
	Calculadora calculadora = new Calculadora();
	assertEquals(0,calculadora.restar(null, 6));
}

@Test
void testRestaNull2() {
	Calculadora calculadora = new Calculadora();
	assertEquals(0,calculadora.restar(5,null));
}

@Test
void testDividir() {
	Calculadora calculadora = new Calculadora();
	assertEquals(3,calculadora.dividir(6, 2));
}
@Test
void testDividirNull() {
	Calculadora calculadora = new Calculadora();
	assertEquals(0,calculadora.dividir(null, 2));
}
@Test
void testDividirNull2() {
	Calculadora calculadora = new Calculadora();
	assertEquals(0,calculadora.dividir(4,null));
}
@Test
void testMultiplicar() {
	Calculadora calculadora = new Calculadora();
	assertEquals(8,calculadora.multiplicar(4,2));
}
@Test
void testMultiplicarNull() {
	Calculadora calculadora = new Calculadora();
	assertEquals(0,calculadora.multiplicar(null,2));
}
@Test
void testMultiplicarNull2() {
	Calculadora calculadora = new Calculadora();
	assertEquals(0,calculadora.multiplicar(4,null));
}}



