package com.cursojava.excepciones;

import javax.swing.JOptionPane;

public class ExcepcionesPropias {
	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("Introduce mail");
		
		try {
			examinaMail(mail);
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, e.getMessage());
			
		}
	}

	/**
	 * Comprueba si la dirección de email es válidad
	 * @param email
	 * @throws MailNotValid 
	 */
	private static void examinaMail(String email) throws MailTooShortException  {
				
		int arroba = 0;
		boolean punto = false;
		
		if(email.length() <= 3) {
			
			throw new MailTooShortException("Mail has 3 or less characters");
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


class MailTooShortException extends RuntimeException{

	private static final long serialVersionUID = -2680994850105348155L;

	public MailTooShortException() {	};
	
	public MailTooShortException(String message) {
		super(message);
		
	};
	
}
