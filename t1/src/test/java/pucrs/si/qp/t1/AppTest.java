package pucrs.si.qp.t1;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest {
	
	@Rule
	  public ExpectedException excecaoEsperada = ExpectedException.none();
	
	@Test
	public void testEscaleno() {
		int actual = App.identificaTriangulo(2, 3, 4);
		int expected = tipos.ESCALENO.value();
		assertEquals(expected, actual);
	}

	@Test
	public void testEquilatero() {
		int actual = App.identificaTriangulo(5, 5, 5);
		int expected = tipos.EQUILATERO.value();
		assertEquals(expected, actual);
	}

	@Test
	public void testIsosceles() {
		int actual = App.identificaTriangulo(6, 6, 7);
		int expected = tipos.ISOSCELES.value();
		assertEquals(expected, actual);
	}

	@Test
	public void testIsoscelesVariante() {
		int actual = App.identificaTriangulo(6, 7, 6);
		int expected = tipos.ISOSCELES.value();
		assertEquals(expected, actual);
	}

	@Test
	public void testIsoscelesVariante2() {
		int actual = App.identificaTriangulo(7, 6, 6);
		int expected = tipos.ISOSCELES.value();
		assertEquals(expected, actual);
	}

	@Test
	public void testInvalidoValorZero() {
		excecaoEsperada.expect(TrianguloRNException.class);
	    excecaoEsperada.expectMessage("Entrada inválida.");
		App.identificaTriangulo(8, 0, 9);
	}

	@Test
	public void testInvalidoValorNegativo() {
		excecaoEsperada.expect(TrianguloRNException.class);
	    excecaoEsperada.expectMessage("Entrada inválida.");
		App.identificaTriangulo(6, 6, -7);
	}
	
	@Test
	public void testInvalidoValorNegativo2() {
		excecaoEsperada.expect(TrianguloRNException.class);
	    excecaoEsperada.expectMessage("Entrada inválida.");
		App.identificaTriangulo(2, 3, -4);
	}

	@Test
	public void testNaoTriangulo1() {
		int actual = App.identificaTriangulo(1,2,3);
		int expected = tipos.INVALIDO.value();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNaoTriangulo2() {
		int actual = App.identificaTriangulo(1,3,2);
		int expected = tipos.INVALIDO.value();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNaoTriangulo3() {
		int actual = App.identificaTriangulo(3,1,2);
		int expected = tipos.INVALIDO.value();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNaoTriangulo4() {
		int actual = App.identificaTriangulo(1,2,8);
		int expected = tipos.INVALIDO.value();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNaoTriangulo5() {
		int actual = App.identificaTriangulo(8,1,2);
		int expected = tipos.INVALIDO.value();
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInvalidoValorZero2() {
		excecaoEsperada.expect(TrianguloRNException.class);
	    excecaoEsperada.expectMessage("Entrada inválida.");
		App.identificaTriangulo(0,0,0);
	}
}