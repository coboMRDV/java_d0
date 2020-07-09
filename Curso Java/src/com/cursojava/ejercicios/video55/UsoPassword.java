package com.cursojava.ejercicios.video55;

import javax.swing.JOptionPane;


public class UsoPassword {
	
	public static void main(String[] args) {

		int passLength = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de la contraseña"));
		
		Password p = new Password(passLength);
		System.out.println("Password Generado: " + p.getPass());
		System.out.println("Password Seguro: " + p.isSafe(p.getPass()));
		

	}

}
