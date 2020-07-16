package com.cursojava.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TiposExcepciones {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("�Qu� desea hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");

		int decision = sc.nextInt();
		if (decision == 1) {
			try {
				pedirDatos();
				
			} catch (InputMismatchException e) {
				System.out.println("Introducci�n err�nea");
				
			}
		} else {
			System.out.println("Adios");
			System.exit(0);
		}

		sc.close();
		System.out.println("Hemos terminado");

	}

	public static void pedirDatos() throws InputMismatchException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre, por favor");
		String nombre = sc.nextLine();

		System.out.println("Introduce edad, por favor");
		int edad = sc.nextInt();

		System.out.println(String.format("Hola %s. El a�o que viene tendr�s %d a�os.", nombre, edad + 1));

		sc.close();

	}

}
