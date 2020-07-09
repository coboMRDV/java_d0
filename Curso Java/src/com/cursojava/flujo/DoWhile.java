package com.cursojava.flujo;

import javax.swing.JOptionPane;

public class DoWhile {
	public static void main(String[] args) {
		String clave = "la clave de acceso";
		String acceso = "";
		
		do{
			acceso = JOptionPane.showInputDialog("Introduce la clave de acceso: ");
			if(!acceso.equals(clave)) {
				System.out.println("La clave es incorrecta");
			}
		}while (!acceso.equals(clave));
		
		System.out.println("Bienvenido a la zona de usuario");	
	}
}
