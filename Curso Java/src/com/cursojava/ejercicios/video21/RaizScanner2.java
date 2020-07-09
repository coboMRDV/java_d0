package com.cursojava.ejercicios.video21;
import java.util.Scanner;

/*
Modifica el programa del ejercicio anterior para reducir lo máximo posible el nº de líneas de
código. El resultado al ejecutar el programa debe ser el que aparece en la siguiente imagen:
*/
public class RaizScanner2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		int num = sc.nextInt();
		
		System.out.println("La raíz de " + num + " es = " + Math.sqrt(num));
		sc.close();
	}

}
