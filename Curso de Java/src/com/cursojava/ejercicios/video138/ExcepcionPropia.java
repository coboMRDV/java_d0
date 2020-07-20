package com.cursojava.ejercicios.video138;

import javax.swing.JOptionPane;

public class ExcepcionPropia {

	public static void main(String[] args) {
		int num;

		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 1 y 100"));

		if(num < 0 || num > 100) {
			NumOutOfRangeException e = new NumOutOfRangeException();
			throw e;
		}
	}
	

}


	
	
class NumOutOfRangeException extends RuntimeException{
	
	public NumOutOfRangeException() {
		
	}
	
	public NumOutOfRangeException(String message) {
		super(message);
		
	}
	
}

