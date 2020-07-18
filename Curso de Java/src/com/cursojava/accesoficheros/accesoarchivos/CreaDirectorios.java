package com.cursojava.accesoficheros.accesoarchivos;

import java.io.File;
import java.io.IOException;

public class CreaDirectorios {

	public static void main(String[] args) {
		File folder = new File(""
				+ "c:/users/cobo/dropbox/testfolder/resources/video152/");
		folder.mkdir();
		
		File file = new File(
		"c:/users/cobo/dropbox/testfolder/resources/video152/datos.xlsx");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Se ha producido un error");
			e.printStackTrace();
		}
	}

}
