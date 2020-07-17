package com.cursojava.accesoficheros.escribirfichero;

import java.io.*;

public class EscribeFichero {

	public static void main(String[] args) {
		Escritura e = new Escritura();
		e.escribeFichero();
	}

}

class Escritura {

	public void escribeFichero() {
//		C:/Users/Cobo/Dropbox/

		String texto = "Estamos escribiendo a través de streams de datos. ";

		try {
			
			FileWriter writer = new FileWriter("C:/Users/Cobo/Dropbox/test_escritura.txt", true);
			for (int i = 0; i < texto.length(); i++) {
				writer.write(texto.charAt(i));
			}
			
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();

		}finally {
			System.out.println("Programa terminado");
		}
	}
}