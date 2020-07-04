package com.cursojava.ejercicios;
/*En este ejercicio, se pide al usuario que introduzca 10 n�meros enteros por consola. Los
n�meros se almacenar�n en un array y el programa calcular� la media de los n�meros
introducidos en las posiciones pares del array. (Debes utilizar el operador m�dulo �%�).*/


import java.util.Scanner;

public class MediaEnPares2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int[] pares = new int[5];
		int indicePares = 0;
		double sumaPares = 0;

		for (int i = 0; i < numeros.length; i++) {
								
			System.out.println("Introduce el n�mero en la posici�n " + (i + 1));
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
