package com.cursojava.ejercicios.video21;
import javax.swing.JOptionPane;
/*
Crea una clase con el nombre de CalculoPotenciaJOptionPane. Al ejecutar el programa nos debe
pedir introducir dos valores numéricos utilizando una ventana de tipo showInputDialog:
• Una base
• Un exponente
Una vez introducidos los dos valores, el programa mostrará en consola el resultado de elevar la
base al exponente tal y como aparece en la siguiente imagen:
*/
public class CalculoPotenciaJOptionPane2 {
	
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
