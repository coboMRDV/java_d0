package com.cursojava.GUIs.fonts;

import java.awt.GraphicsEnvironment;

public class LetrasEnLocal {

	public static void main(String[] args) {
		String [] misFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		int contador = 1;
		for(String fuente : misFuentes) {
			
			System.out.println("["+contador+"] " + fuente);
			contador ++;
		}
	}

}
