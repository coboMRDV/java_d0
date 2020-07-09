package com.cursojava.flujo;

import javax.swing.JOptionPane;

public class While1 {

	public static void main(String[] args) {
		String clave = "la clave de acceso";
		String acceso = "";
		
		while (!acceso.equals(clave)){
			acceso = JOptionPane.showInputDialog("Introduce la clave de acceso: ");
			if(!acceso.equals(clave)) {
				System.out.println("La clave es incorrecta");
			}
		}
		System.out.println("Bienvenido a la zona de usuario");
	}

}
