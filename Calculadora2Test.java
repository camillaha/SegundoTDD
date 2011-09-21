import static org.junit.Assert.*;

import org.junit.Test;

public class Calculadora2Test {

	@Test
	public void deveSomarListaDeValores() {
		int[] valores = { 1, -2, 6 };
		int resultado = Calculadora2.somar(valores);
		assertEquals(5, resultado);
	}

	@Test
	public void deveMultiplicarListaDeValores() {
		int[] valores = { 12, 2, 2 };
		int resultado = Calculadora2.multiplicar(valores);
		assertEquals(48, resultado);
	}

	@Test
	public void deveDividirDoisValores() {
		int resultado = Calculadora2.dividir(4, 2);
		assertEquals(2, resultado);
	}
}