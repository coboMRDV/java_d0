package com.cursojava.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejempl3 {
	public static void main(String[] args) {
		/*
		 * Para beca, el alumno tiene que cumplir dos requisitos. -Vivir a menos de 10km
		 * -La renta familiar debe ser menor de 20000€
		 */
		int distanciaAlCentro;
		double rentaFamiliar;
		byte hermanosEnElCentro;

		distanciaAlCentro = Integer.parseInt(JOptionPane.showInputDialog("Introduce distancia hasta el centro en km"));

		rentaFamiliar = Double.parseDouble(JOptionPane.showInputDialog("Introduce la renta familiar"));

		hermanosEnElCentro = Byte.parseByte(JOptionPane.showInputDialog("Introduce el número de hermanos"));

//		if (distanciaAlCentro > 10 && rentaFamiliar < 20000 && hermanosEnElCentro >=2)  {
//			System.out.println("Tienes derecho a beca");
//		} else {
//			System.out.println("Lo siento. No tienes derecho a beca");
//		}

		if (distanciaAlCentro > 10 || rentaFamiliar < 20000 || hermanosEnElCentro >= 2) {
			System.out.println("Tienes derecho a beca");
		} else {
			System.out.println("Lo siento. No tienes derecho a beca");
		}
		
	}
}
