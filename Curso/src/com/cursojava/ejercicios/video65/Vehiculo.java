package com.cursojava.ejercicios.video65;

public interface Vehiculo {
	int VELOCIDAD_MAXIMA = 120;
	
	/**
	 * Aumenta la velocidad del ven�culo
	 * de acuerdo al valor indicado en el
	 * par�metro aumento 
	 * 
	 * @param aumento int Incremento de la velocidad
	 */
	public abstract void acelerar(int aumentoVelocidad);
	
	
	/**
	 * Reduce la velocidad del veh�culo
	 * de acuerdo al valor indicado en el 
	 * par�metro decremento
	 * 
	 * @param decremento int Decremento de la velocidad
	 */
	public abstract void frenar(int decrementoVelocidad);
	
	public abstract int plazas();
}
