package com.cursojava.accesoficheros.accesoarchivos;

import java.io.*;


public class AccesoArchivos {
		public static void main(String[] args) {
//			si no se ha escrito otra ruta aquí toma la ruta raíz del proyecto
//			File archivo = new File("archivo");
			File archivo = new File("c:/users/cobo/dropbox/testfolder");
			
//			System.out.println(archivo.getAbsolutePath());
//			System.out.println(archivo.exists());
			
			String[]files = archivo.list();
			
			
			for (String file : files) {
				System.out.println("" + file);
				
				File f = new File(archivo.getAbsolutePath(), file);
				if(f.isDirectory()) {
for (String a : files) {
						System.out.println("\t" + a);
					}
				}
			}
		}
}
