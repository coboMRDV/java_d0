package com.cursojava.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo_1 {

	public static void main(String[] args) {
		int edad;
		edad = Integer.parseInt(JOptionPane.showInputDialog(
				"Introduce tu edad, por favor:"));
				
		if(edad >= 18) {
			System.out.println("Eres mayor de edad. Puedes pasar");
		}else {
			System.out.println("Eres menor de edad. no puedes pasar");
		}
	}

}
