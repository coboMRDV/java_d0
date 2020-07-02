package com.cursojava.ejercicios;
import java.util.Scanner;

/*
Crea una clase con el nombre de RaizScanner. Al ejecutar el programa nos debe pedir introducir
un n� por consola. Despu�s de introducir el n� y pulsar ENTER, el programa devuelve en consola
la ra�z cuadrada del n�mero tal y como aparece en la siguiente imagen:
*/
public class RaizScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero: ");
		
		int num = sc.nextInt();
		
		System.out.println(
				"La ra�z de " + num + " es = " + Math.sqrt(num));
	}

}
