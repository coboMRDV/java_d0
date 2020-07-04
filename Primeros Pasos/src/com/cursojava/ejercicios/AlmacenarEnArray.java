package com.cursojava.ejercicios;

import javax.swing.JOptionPane;

/*
En este ejercicio se pide al usuario que introduzca 10 números enteros por consola. Los números
introducidos se almacenarán en un array. El programa imprime en consola cuántos números
negativos, positivos y valores 0 hay en el array
*/

public class AlmacenarEnArray {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		int negativos = 0;
		int positivos = 0;
		int ceros = 0;
		
		for(int i = 0; i < numeros.length; i ++) {
			int numeroIntroducido =Integer.parseInt(JOptionPane.showInputDialog(
					"Introduce el número en la posición " + (i +1)));
			numeros[i] = numeroIntroducido ;
			if(numeroIntroducido == 0) {
				ceros ++;
			}if(numeroIntroducido > 0) {
				positivos ++;
			}else{
				negativos ++;
			}
		}
		
		System.out.println(
				"Positivos:\t" + positivos + "\n" + 
				"Negativos:\t" + negativos + "\n" +
				"Ceros:\t\t" + ceros + "\n"
				
				);

	}

}
