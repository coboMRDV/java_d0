package com.cursojava.poo;

public class UsoVehiculos {

	public static void main(String[] args) {

		Vehiculo miCoche = new Vehiculo(4);
		miCoche.setColor("Amarillo");
		System.out.println(miCoche.getColor());

		Vehiculo miCoche2 = new Vehiculo(4);
		miCoche2.setColor("Rojo");

		miCoche2.setExtra(true);

		System.out.println(miCoche2.getExtra());

		Vehiculo moto1 = new Vehiculo(2);

		System.out.println(miCoche.getDatosVehiculo());
		System.out.println(miCoche2.getDatosVehiculo());

		Vehiculo miMoto = new Vehiculo(2, 1, 0.3, 200);
		miMoto.setColor("gris");
		System.out.println(miMoto.getDatosVehiculo());

		Vehiculo miCamion = new Vehiculo(6, 3, 1.5, 3500);
		miCamion.setColor("azul");
		miCamion.setExtra(true, true, true);
		System.out.println(miCamion.getDatosVehiculo());
		System.out.println(miCamion.getExtra());

	}

}
