package com.cursojava.ejercicios.video21;
import java.util.Scanner;

/*
Modifica el programa del ejercicio anterior para reducir lo m�ximo posible el n� de l�neas de
c�digo. El resultado al ejecutar el programa debe ser el que aparece en la siguiente imagen:
*/
public class RaizScanner2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero: ");
		
		int num = sc.nextInt();
		
		System.out.println("La ra�z de " + num + " es = " + Math.sqrt(num));
		sc.close();
	}

}
