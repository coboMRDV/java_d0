package com.cursojava.ejercicios.video33;

import javax.swing.JOptionPane;

public class HallarFactorial {
	/*
	 * En este ejercicio, se pide el cálculo del factorial de un número introducido
	 * por el usuario desde una ventana JOptionPane. El factorial de un número es
	 * igual a ese número multiplicado por todos los que le preceden. Por ejemplo,
	 * el factorial de 5 es igual a 5x4x3x2x1, es decir, 120.
	 */

	public static void main(String[] args) {
		int factorialDe = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número"));
		int resultado = factorialDe;
		
		for (int i = factorialDe - 1; i > 0; i--) {
			resultado = resultado * i;
		}
		JOptionPane.showMessageDialog(null, resultado);
		System.out.println(resultado);

	}

}
