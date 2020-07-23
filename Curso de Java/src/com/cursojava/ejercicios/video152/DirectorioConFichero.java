package com.cursojava.ejercicios.video152;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class DirectorioConFichero {

	public static void main(String[] args) {

		/* ================= creación nueva carpeta ================ */
		String currentFolder = "c:/users/cobo/dropbox/testfolder";
		String newFolderName = JOptionPane.showInputDialog("Nombre del nuevo fichero");

		File newFolder = new File(currentFolder + "/" + newFolderName);
		newFolder.mkdir();

		/* ================= creación nuevo archivo ================ */
		String newFileName = JOptionPane.showInputDialog("Nombre del nuevo archivo");
		File newFile = new File(newFolder.getAbsolutePath() + "/" + newFileName);

		try {
			newFile.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}

		/*
		 * ================= creación mensaje para el archivo de texto ================
		 */
		String message = JOptionPane.showInputDialog("Escribe un mensaje");

		try {
			FileWriter messageWriter = new FileWriter(newFile.getAbsolutePath());
			
			messageWriter.write(message);
			messageWriter.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
