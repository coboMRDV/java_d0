package com.cursojava.ejercicios.video138;

import javax.swing.JOptionPane;

public class ExcepcionPropia3 {

	public static void main(String[] args) {
		int num;

		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 1 y 100"));
		
		if(num < 0 || num > 100) {
			
			MyException e = new MyException("Número fuera de rango");
			throw e;
		}else {
			System.out.println("Número válido");
		}
	}
	

}

	
	
class MyException extends RuntimeException{
	
	public MyException() {
		
	}
	
	public MyException(String message) {
		super(message);
		
	}
	
}

