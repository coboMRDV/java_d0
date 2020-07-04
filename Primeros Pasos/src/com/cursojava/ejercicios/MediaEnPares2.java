package com.cursojava.ejercicios;
/*En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola. Los
números se almacenarán en un array y el programa calculará la media de los números
introducidos en las posiciones pares del array. (Debes utilizar el operador módulo “%”).*/


import java.util.Scanner;

public class MediaEnPares2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int[] pares = new int[5];
		int indicePares = 0;
		double sumaPares = 0;

		for (int i = 0; i < numeros.length; i++) {
								
			System.out.println("Introduce el número en la posición " + (i + 1));
			int numeroIntroducido = sc.nextInt();
			numeros[i] = numeroIntroducido;

			if (i % 2 == 0 && i != 0) {
				pares[indicePares] = numeroIntroducido;
				indicePares++;
			}

		}
		sc.close();
		for (int i = 0; i < pares.length; i++) {
			sumaPares += pares[i];
		}

		System.out.println("La media de los valores en las posiciones" + "pares del array es: " + (sumaPares / 5));

	}

}
