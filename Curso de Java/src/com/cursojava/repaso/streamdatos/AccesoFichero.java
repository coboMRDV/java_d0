package com.cursojava.repaso.streamdatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AccesoFichero {
	public static void main(String[] args) {
		LeeEscribeFichero l = new LeeEscribeFichero();
		l.leeFichero();
	}
}

class LeeEscribeFichero {

	private FileReader reader;
	private FileWriter writer;

	public void leeFichero() {
		try {
			reader = new FileReader("c:/users/cobo/dropbox/testfolder/dune_quotes.txt");
			writer = new FileWriter("c:/users/cobo/dropbox/testfolder/dune_quotes_copy.txt");
			int c = reader.read();
			while (c != -1) {
				System.out.print((char) c);
				writer.write((char)c);
				c = reader.read();
			}

			reader.close();
			writer.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}