package com.cursojava.programaciongenerica;

import java.io.File;

public class UsoMyArrayList {

	public static void main(String[] args) {
		MiArrayList archivos = new MiArrayList(6);
		
		archivos.addObject("María");
		archivos.addObject("Antonio");
		archivos.addObject("Ana");
		archivos.addObject("Juan");
		archivos.addObject("Pedro");
		
//		String nombrePersona = (String) archivos.getObject(2);
		
		archivos.addObject(new File("c:/users/cobo/dropbox/testfolder/mev.jpg"));
		
		File nombrePersona = (File)archivos.getObject(1);
		
		
		System.out.println(nombrePersona);
		
		
		
		
		
	}

}
