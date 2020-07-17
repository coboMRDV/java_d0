package com.cursojava.accesoficheros.buffers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EscribiendoArchivo {

	public static void main(String[] args) {
		try {
			FileInputStream readFile = new FileInputStream("c:/users/cobo/dropbox/cAvatar.png");
			boolean finalArchivo = false;

			while (!finalArchivo) {
				int byteImagenEntrada = readFile.read();

				if (byteImagenEntrada == -1) {
					finalArchivo = true;
				}
				System.out.println(byteImagenEntrada);
			}
			readFile.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se encontró el archivo");
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("Se produjo un error al acceder al archivo");
			e.printStackTrace();

		}
	}

}
