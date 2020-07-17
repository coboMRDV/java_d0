package com.cursojava.accesoficheros.buffers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribiendoArchivo {

	public static void main(String[] args) {
		try {
			FileInputStream readFile = new FileInputStream("c:/users/cobo/dropbox/cAvatar.png");
			boolean finalArchivo = false;
			int contador = 0; // Para pillar el tamaño del array

			while (!finalArchivo) {
				int byteImagenEntrada = readFile.read();
				if (byteImagenEntrada == -1) {
					finalArchivo = true;
				}
//				System.out.println(byteImagenEntrada);
				contador++;
			}

			int[] bytesImagen = rellenarArray(contador);

			for (int i = 0; i < bytesImagen.length; i++) {
				System.out.println(bytesImagen[i]);
			}

			creaFichero(bytesImagen);

			readFile.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el archivo");
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("Se produjo un error al acceder al archivo");
			e.printStackTrace();

		}

	}

	static void creaFichero(int[] arrayExterno) {
		try {
			FileOutputStream ficheroExterno = new FileOutputStream("c:/users/cobo/dropbox/Test/copiaAvatar.png");
			for (int i = 0; i < arrayExterno.length; i++) {
				ficheroExterno.write(arrayExterno[i]);

			}
			ficheroExterno.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	static int[] rellenarArray(int arraySize) {

		int[] arr = new int[arraySize];

		try {
			FileInputStream readFile = new FileInputStream("c:/users/cobo/dropbox/cAvatar.png");
			int i = 0;
			while (i < arraySize) {
				int b = readFile.read();
				if (b != -1) {
					arr[i] = b;

				}
				i++;
			}
			readFile.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

		return arr;

	}

}
