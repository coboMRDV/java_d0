package com.cursojava.ejercicios.video65;

/**
 * Moto.java
 * Crea objetos de la clase Moto
 * para su uso en ejercicio de
 * curso java
 * 
 * @author Cobo
 *
 */
public class Moto implements Vehiculo{
	
	private int velocidad;
	
	public Moto(int velocidadInicial) {
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
		return 2;
	}

}
