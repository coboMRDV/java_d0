package com.cursojava.ejercicios.video43;

import javax.swing.JOptionPane;

public class UsoSucursalYPaquetes {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Introduzca los datos indicados");
		
//		Datos sucursal
		int numSucursal = Integer.parseInt(JOptionPane.showInputDialog("" + "N� Sucursal"));
		String direccion = JOptionPane.showInputDialog("" + "Direcci�n");
		String cuidad = JOptionPane.showInputDialog("Ciudad");
		short numEnvios = (short) Integer.parseInt(JOptionPane.showInputDialog("�Cu�ntos paquetes desea enviar?"));

		Sucursal sucursal = new Sucursal(numSucursal, direccion, cuidad);

//		Datos paquetes
		Paquete[] paquetes = new Paquete[numEnvios];
		int ref;
		String dni;
		double peso;
		short prioridad;
		dni = JOptionPane.showInputDialog("Introduzca su DNI");

		for (int i = 0; i < numEnvios; i++) {
			ref = Integer.parseInt(JOptionPane.showInputDialog("Introduzca referencia"));
			peso = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el peso (kg)"));
			prioridad = (short) Integer.parseInt(JOptionPane.showInputDialog("Prioridad"));
			paquetes[i] = new Paquete(ref, peso, dni, prioridad);
		}
		
		
		System.out.println("===========Datos Env�os===========");
		System.out.println("N� Paquetes: \t" + numEnvios);
		System.out.println("==================================");
		System.out.println("==================================");
		
		for (Paquete paquete : paquetes) {
			System.out.println("DNI: \t\t" + paquete.dniRemitente);
			System.out.println(sucursal.getDatos(paquete)); 
		}

	}

}
