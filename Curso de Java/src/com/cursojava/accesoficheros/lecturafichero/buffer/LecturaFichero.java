package com.cursojava.accesoficheros.lecturafichero.buffer;

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
			BufferedReader buffer = new BufferedReader(entrada);
			
			String line = buffer.readLine();
			while (line != null) {
				System.out.println(line);
				line= buffer.readLine();
			}
			entrada.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
		}
	}

}