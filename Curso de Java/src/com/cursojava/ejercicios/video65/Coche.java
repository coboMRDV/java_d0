package com.cursojava.ejercicios.video65;

/**
 * Coche.java
 * 
 * Crea objetos de la clase coche para su uso en un ejercicio de curso java
 * 
 * @author Cobo
 *
 */
public class Coche implements Vehiculo {
	int velocidad;
	int plazas;

	/**
	 * Constructor de la clase coche Se inicia el objeto con una velocidad inicial
	 * 
	 * @param velocidadInicial int velocidad inicial del coche
	 */
	public Coche(int velocidadInicial) {
		velocidad = velocidadInicial;
	}

	/**
	 * Devuelve la velocidad actual del vehículo
	 * 
	 * @return int velocidad actual
	 */
	public int getVelocidadActual() {
		return velocidad;
	}

	@Override
	public void acelerar(int aumentoVelocidad) {
		if (velocidad + aumentoVelocidad < Vehiculo.VELOCIDAD_MAXIMA) {
		}else {
			velocidad += aumentoVelocidad;
			System.out.println("La velocidad máxima ha sido superada!");
		}
	}

	@Override
	public void frenar(int decrementoVelocidad) {
		velocidad -= decrementoVelocidad;
	}

	@Override
	public int plazas() {
		return 5;
	}

}