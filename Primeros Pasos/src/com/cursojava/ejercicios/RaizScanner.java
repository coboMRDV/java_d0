package com.cursojava.ejercicios;
import java.util.Scanner;

/*
Crea una clase con el nombre de RaizScanner. Al ejecutar el programa nos debe pedir introducir
un nº por consola. Después de introducir el nº y pulsar ENTER, el programa devuelve en consola
la raíz cuadrada del número tal y como aparece en la siguiente imagen:
*/
public class RaizScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		
		int num = sc.nextInt();
		
		System.out.println(
				"La raíz de " + num + " es = " + Math.sqrt(num));
	}

}
