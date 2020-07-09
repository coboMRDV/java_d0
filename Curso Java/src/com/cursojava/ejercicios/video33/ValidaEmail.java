package com.cursojava.ejercicios.video33;

import javax.swing.JOptionPane;

public class ValidaEmail {
	/*
	 * En este ejercicio se pide al usuario que introduzca su direcci�n de email con
	 * ayuda de la clase JOptionPane. Una vez introducido el email, el programa debe
	 * decir si la direcci�n de email es correcta o no teniendo en cuenta los
	 * siguientes requisitos: 
	 * 1. Debe tener una @ 
	 * 2. No debe tener m�s de una @ 
	 * 3. Debe tener un punto 
	 * 4. La direcci�n de email debe tener al menos 4
	 * caracteres. 
	 * El programa pedir� introducir indefinidamente la direcci�n de
	 * email si no es correcta o si tienes menos de 4 caracteres
	 */

	public static void main(String[] args) {

//		String email = "";
//		Boolean valido = false;

//		while (!valido) {
//			email = JOptionPane.showInputDialog("Introduce una direcci�n de email, por favor");
//
//			if (email.length() >= 4) {
//				if (email.indexOf("@") != -1 && email.indexOf(".") != -1) {
//					int countOfAt = 0;
//					for (int i = 0; i < email.length(); i++) {
//						if (Character.toString(email.charAt(i)).equals("@")) {
//							countOfAt++;
//						}
//					}
//					if (countOfAt == 1) {
//						valido = true;
//						System.out.println("Mail v�lido");
//					}
//				}
//			}
//		}
		

		Boolean valido = false;

		do{
			String email = JOptionPane.showInputDialog("Introduce una direcci�n de email, por favor");

			if (email.length() >= 4) {
				if (email.indexOf("@") != -1 && email.indexOf(".") != -1) {
					int countOfAt = 0;
					for (int i = 0; i < email.length(); i++) {
						if (Character.toString(email.charAt(i)).equals("@")) {
							countOfAt++;
						}
					}
					if (countOfAt == 1) {
						valido = true;
						JOptionPane.showMessageDialog(null, "Mail v�lido");
						
					}
				}
			}
		}while (!valido) ;
		
		
	}
}
