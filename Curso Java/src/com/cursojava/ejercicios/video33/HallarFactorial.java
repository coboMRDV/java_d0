package com.cursojava.ejercicios.video33;

import javax.swing.JOptionPane;

public class HallarFactorial {
	/*
	 * En este ejercicio, se pide el c�lculo del factorial de un n�mero introducido
	 * por el usuario desde una ventana JOptionPane. El factorial de un n�mero es
	 * igual a ese n�mero multiplicado por todos los que le preceden. Por ejemplo,
	 * el factorial de 5 es igual a 5x4x3x2x1, es decir, 120.
	 */

	public static void main(String[] args) {
		int factorialDe = Integer.parseInt(JOptionPane.showInputDialog("Escribe un n�mero"));
		int resultado = factorialDe;
		
		for (int i = factorialDe - 1; i > 0; i--) {
			resultado = resultado * i;
		}
		JOptionPane.showMessageDialog(null, resultado);
		System.out.println(resultado);

	}

}
