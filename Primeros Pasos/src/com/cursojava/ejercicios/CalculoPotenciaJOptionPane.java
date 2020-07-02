package com.cursojava.ejercicios;
import javax.swing.JOptionPane;
/*
Modifica el programa del ejercicio anterior para reducir lo máximo posible el nº de líneas de
código. El resultado al ejecutar el programa debe ser el que aparece en la siguiente imagen:
*/
public class CalculoPotenciaJOptionPane {
	
	public static void main(String args[]) {
		
		int base = Integer.parseInt(JOptionPane.showInputDialog(
				"Introduce la base"));
		
		int exponente = Integer.parseInt(JOptionPane.showInputDialog(
				"Introduce el exponente"));
		
		System.out.println(
				"El resultado de " + base +" "
						+ "elevado a " + exponente + " "
								+ "es " + Math.pow(base, exponente));
		
	}
	
}
