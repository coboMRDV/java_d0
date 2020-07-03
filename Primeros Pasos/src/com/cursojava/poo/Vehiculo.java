package com.cursojava.poo;

/**
 * Date: July 3, 2020 Simple aplicación para crear vehículos
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
	 * Constructor de la clase vehículo
	 */
	public Vehiculo(int ruedas) {

		this.ruedas = ruedas;
		largo = 2;
		ancho = 1;
		peso = 2;
		color = "Sin Color";
	}

	/**
	 * Establece un nuevo color para el objeto vehículo
	 * 
	 * @param color nuevo color para el vehículo
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Devuelve el color del vehículo
	 * 
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	public String getDatosVehiculo() {
		return "####Datos Vehículo#### \n"+ 
				"Nº ruedas:\t"+ ruedas+"\n" + 
				"Largo:\t\t" + largo + "m\n" + 
				"Ancho:\t\t" + ancho + "m\n" + 
				"Peso:\t\t" + peso + "kg\n" + 
				"Color:\t\t" + color + "\n"	+ 
				"######################";

	}

}
