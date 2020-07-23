package com.cursojava.ejercicios.video135;

import javax.swing.JOptionPane;

public class ControlExcepciones {
	
	public static void main(String[] args) {
		try {
			int num = Integer.valueOf(JOptionPane.showInputDialog("Introduce un número"));
			
			if(num % 2 == 0) {
				JOptionPane.showMessageDialog(null, "El número " + num + " es par");
			}else {
				JOptionPane.showMessageDialog(null, "El número " + num + " es impar");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Es valor introducido no es numérico, el programa se cerrará");
		}
	}

}
