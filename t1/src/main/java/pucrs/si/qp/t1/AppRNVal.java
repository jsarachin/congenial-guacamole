package pucrs.si.qp.t1;

import java.lang.instrument.IllegalClassFormatException;

public class AppRNVal {

	public static void validaEntradasTriangulo(int valorA, int valorB,int valorC) throws TrianguloRNException {
		if(valorA <= 0 || valorB <= 0 || valorC <= 0) {
			throw new TrianguloRNException("Entrada inválida.");
		}
	}
}
