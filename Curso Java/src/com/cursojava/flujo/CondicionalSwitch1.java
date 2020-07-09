package com.cursojava.flujo;

import javax.swing.JOptionPane;

public class CondicionalSwitch1 {

	public static void main(String[] args) {
		char hijos = (char) Integer.parseInt(JOptionPane.showInputDialog("Introduce número de hijos: "));

		switch (hijos) {
		case 0:
			System.out.println("La natalidad es baja, tenlo en cuenta");
			break;
		case 1:
			System.out.println("Por algo se empieza");
			break;
		case 2:
			System.out.println("Tienes la pareja");
			break;
		case 3:
			System.out.println("Veo que te estás animando");
			break;
		case 4:
			System.out.println("Ya ienes familia numerosa");
			break;

		default:
			System.out.println("Vas a tener que trabajar duro");
			break;
		}
	}
}