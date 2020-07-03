package com.cursojava.poo;

public class UsoVehiculos {

	public static void main(String[] args) {

		Vehiculo miCoche = new Vehiculo(4);
		Vehiculo miCoche2 = new Vehiculo(4);
		Vehiculo miMoto1 = new Vehiculo(2);

		miCoche.setColor("Verde");
		miMoto1.setColor("Rojo");

		System.out.println(miCoche.getDatosVehiculo());

	
		

	}

}
