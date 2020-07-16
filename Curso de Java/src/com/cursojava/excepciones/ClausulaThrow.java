package com.cursojava.excepciones;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class ClausulaThrow {

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("Introduce mail");
		
		examinaMail(mail);
	}

	/**
	 * Comprueba si la dirección de email es válidad
	 * @param email
	 */
	private static void examinaMail(String email) throws InputMismatchException  {
				
		int arroba = 0;
		boolean punto = false;
		
		if(email.length() <= 3) {
			InputMismatchException myException = new InputMismatchException();
			throw myException;
		}
		
		for(int i = 0; i < email.length(); i ++) {
			if(email.charAt(i) == '@') {
				arroba ++;
			}
			
			if(email.charAt(i) == '.') {
				punto = true;
			}
		}
		
		if(arroba == 1 && punto == true) {
			System.out.println("Email válido");
		}else {
			System.out.println("Email no válido");
		}
	}

}
