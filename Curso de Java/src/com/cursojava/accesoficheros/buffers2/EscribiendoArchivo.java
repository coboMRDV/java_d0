package com.cursojava.accesoficheros.buffers2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EscribiendoArchivo {

	public static void main(String[] args) {
		try {
			FileInputStream readFile = new FileInputStream("c:/users/cobo/dropbox/cAvatar.png");
			boolean finalArchivo = false;
			int contador = 0;
			while (!finalArchivo) {
				int byteImagenEntrada = readFile.read();
				
				if(byteImagenEntrada == -1){
					finalArchivo = true;
				}
				
				if(contador % 16 == 0) {
					System.out.println();
				}
				System.out.print(String.format("%-3d | ", byteImagenEntrada));
				contador ++;
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
