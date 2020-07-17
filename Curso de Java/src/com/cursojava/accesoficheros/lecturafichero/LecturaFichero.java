package com.cursojava.accesoficheros.lecturafichero;

import java.io.*;

public class LecturaFichero {

	public static void main(String[] args) {
		LeerFichero f = new LeerFichero();
		f.leeFichero();
		
	}

}

class LeerFichero {


	public void leeFichero() {
		// C:/Users/Cobo/Dropbox/quote.txt
		try {
			FileReader entrada = new FileReader("C:/Users/Cobo/Dropbox/quote.txt");
			int caracter = entrada.read();
			while (caracter != -1) {
				System.out.print((char) caracter);
				caracter = entrada.read();
			}
			entrada.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
		}
	}

}