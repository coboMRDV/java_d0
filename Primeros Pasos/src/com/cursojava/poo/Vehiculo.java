package com.cursojava.poo;

/**
 * Date: July 3, 2020 Simple aplicaci�n para crear veh�culos
 * 
 * @author Cobo
 * @version 1.0
 *
 */
public class Vehiculo {

	/**
	 * int value for ruedas, largo, ancho y peso string value for color
	 */
	private int ruedas;
	private String color;
	private int largo;
	private int ancho;
	private int peso;

	/**
	 * Constructor de la clase veh�culo
	 */
	public Vehiculo(int ruedas) {

		this.ruedas = ruedas;
		largo = 2;
		ancho = 1;
		peso = 2;
		color = "Sin Color";
	}

	/**
	 * Establece un nuevo color para el objeto veh�culo
	 * 
	 * @param color nuevo color para el veh�culo
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Devuelve el color del veh�culo
	 * 
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	public String getDatosVehiculo() {
		return "####Datos Veh�culo#### \n"+ 
				"N� ruedas:\t"+ ruedas+"\n" + 
				"Largo:\t\t" + largo + "m\n" + 
				"Ancho:\t\t" + ancho + "m\n" + 
				"Peso:\t\t" + peso + "kg\n" + 
				"Color:\t\t" + color + "\n"	+ 
				"######################";

	}

}
