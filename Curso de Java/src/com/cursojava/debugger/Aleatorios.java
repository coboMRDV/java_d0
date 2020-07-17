package com.cursojava.debugger;

import javax.swing.JOptionPane;

public class Aleatorios {

	public static void main(String[] args) {
		
		int numElementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));
		int numAleatorios[] = new int[numElementos];

 		for (int i = 0; i < numAleatorios.length; i++) {
			numAleatorios[i] = (int) (Math.random() * 100);
		}

		for (int e : numAleatorios) {
			System.out.println(e);
		}
	}

}