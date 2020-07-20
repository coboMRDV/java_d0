package com.cursojava.ejercicios.video138;

import javax.swing.JOptionPane;

public class ExcepcionPropia2 {

	public static void main(String[] args) {
		int num;

		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 1 y 100"));

		evaluaNumero(num);

	}
	
	static void evaluaNumero(int num) {
		if (num < 0 || num > 100) {
			throw new OutOfRangeException();
		} else {
			System.out.println("Número correcto");
		}
	}
}


	
	
class OutOfRangeException extends RuntimeException{
	

	public OutOfRangeException(String message) {
		super(message);
		
	}
	
	public OutOfRangeException() {
		
	}
	
}

