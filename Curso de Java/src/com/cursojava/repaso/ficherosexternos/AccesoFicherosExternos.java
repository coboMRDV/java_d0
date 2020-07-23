package com.cursojava.repaso.ficherosexternos;

import java.io.*;

public class AccesoFicherosExternos {

	public static void main(String[] args) {
		
		File examinedFolder = new File("c:/users/cobo/dropbox/testfolder");
		
		System.out.println("Absolute path: " + examinedFolder.getAbsolutePath());
		System.out.println("Path: " + examinedFolder.getPath());
		
		System.out.println("Does the file exist?: " + examinedFolder.exists());
		
		String[] fileNames = examinedFolder.list();
		
		for(String fileName : fileNames) {
			
			File f = new File(examinedFolder.getAbsolutePath(), fileName);
			if(f.isDirectory()) {
				System.out.println(fileName + "/");
				String[] subDirectoryFileNames = f.list();
				for(int i = 0; i < subDirectoryFileNames.length; i ++) {
					System.out.println("\t" + subDirectoryFileNames[i]);
				}
			}else {
				
				System.out.println(fileName);
			}
			
		}
		
		
		try {
			System.out.println(examinedFolder.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
