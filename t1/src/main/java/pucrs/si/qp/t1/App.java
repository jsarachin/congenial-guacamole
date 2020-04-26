package pucrs.si.qp.t1;

import java.lang.instrument.IllegalClassFormatException;

/**
 * 
 * @author marco.mangan@pucrs.br
 * 
 */
public class App {

	public static int identificaTriangulo(int a, int b, int c) throws TrianguloRNException {
		AppRNVal.validaEntradasTriangulo(a, b, c);
		if ((a < b + c) && (b < a + c) && (c < b + a)) {
			if ((a == b) && (b == c))
				return tipos.EQUILATERO.value();
			else if ((a != b) && (a != c) && (b != c))
				return tipos.ESCALENO.value();
			else
				return tipos.ISOSCELES.value();
		}
		return tipos.INVALIDO.value();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Triângulos!");
		try {
			System.out.println(identificaTriangulo(2, 3, 4));
		} catch (TrianguloRNException e) {
			System.out.println(e.getMessage());
		}
	}
}