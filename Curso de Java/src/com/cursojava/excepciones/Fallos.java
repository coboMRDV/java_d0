package com.cursojava.excepciones;

import javax.swing.JOptionPane;

public class Fallos {
	public static void main(String[] args) {

		int[] miMatriz = new int[5];

		miMatriz[0] = 5;
		miMatriz[1] = 38;
		miMatriz[2] = -15;
		miMatriz[3] = 92;
		miMatriz[4] = 71;
		

		for (int i = 0; i < 5; i++) {
			System.out.println("Posici�n " + i + " = " + miMatriz[i]);
		}
		
		/* ================= peticion de los datos personales ================ */
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduct tu edad")) ;
		
		
		System.out.println(String.format(
				"Hola %s. Tienes %d a�os. El programa termin� su ejecuci�n", nombre, edad));
	}

}
