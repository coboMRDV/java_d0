package com.cursojava.flujo;

import javax.swing.JOptionPane;

public class AnidamientoIf {

	public static void main(String[] args) {
		int edad;
		edad = Integer.parseInt(JOptionPane.showInputDialog(
				"Introduce tu edad, por favor "));
		
		if(edad >= 18) {
			String carnet = JOptionPane.showInputDialog("¿Tienes carnet? [Si | No]");
			
			if(carnet.toLowerCase().equals("si")) {
				JOptionPane.showMessageDialog(null, "Puedes comprar el coche");
			}else {
				JOptionPane.showMessageDialog(null, "Primero tienes que tener carnet");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Espera a tener 18 años");
			
		}
	}

}
