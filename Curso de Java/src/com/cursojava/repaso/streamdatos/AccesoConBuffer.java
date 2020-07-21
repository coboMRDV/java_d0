package com.cursojava.repaso.streamdatos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoConBuffer {

	public static void main(String[] args) {
		LeeConBuffer lcb = new LeeConBuffer();
		lcb.leeArchivo();
	}

}

class LeeConBuffer{
	private BufferedReader bReader;
	private String path = "c:/users/cobo/dropbox/testfolder/dune_quotes.txt";
	
	public void leeArchivo() {
		try {
			bReader = new BufferedReader(
					new FileReader(path));
			
			String line = bReader.readLine();
			while(line != null) {
				System.out.println(bReader.readLine());
				line = bReader.readLine();
			}
			bReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}