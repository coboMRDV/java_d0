package com.cursojava.ejercicios.video38;

/*
 * En este ejercicio debes crear un array de 100 elementos que guarde en cada una de las
posiciones un n� aleatorio entre 1 y 100. El programa debe imprimir en consola todos los valores
almacenados en el array. Utiliza un bucle for-each para leer los valores almacenados. (Debes
utilizar el m�todo random() de la clase Math).*/

public class ImprimeAleatorios {

	public static void main(String[] args) {
		int[] numeros = new int[100];
		
		for(int i = 0; i < numeros.length; i ++) {
			numeros[i] = (int) (Math.random() * (100 - 1) + 1);	
		}
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
	}

}
