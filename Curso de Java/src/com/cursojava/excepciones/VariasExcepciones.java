package com.cursojava.excepciones;

import javax.swing.JOptionPane;

public class VariasExcepciones {

	public static void main(String[] args) {

		try {
			division();

		} catch (ArithmeticException e) {
			System.out.println("No se puede realizar división por 0");
			JOptionPane.showMessageDialog(null, "No se puede realizar división por 0");
		} catch (NumberFormatException e) {
			System.out.println("Debes introducir un número");
			JOptionPane.showMessageDialog(null, "Debes introducir un número");
		}
	}

	static void division() throws ArithmeticException, NumberFormatException {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividento"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		System.out.println("El resultado es " + num1 / num2);
	}

}
