package com.cursojava.repaso.streamdatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {
	public static void main(String[] args) {
		LeerFichero l = new LeerFichero();
		l.leeFichero();
	}
}

class LeerFichero {

	private FileReader reader;

	public void leeFichero() {
		try {
			reader = new FileReader("c:/users/cobo/dropbox/testfolder/dune_quotes.txt");

			int c = reader.read();
			while (c != -1) {
				System.out.print((char) c);
				c = reader.read();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}