package com.cursojava.poo;

/**
 * Date: July 3, 2020 Simple aplicación para crear vehículos
 * 
 * @author Cobo
 * @version 1.0
 *
 */
public class Vehiculo {

//	Propiedades
	private int ruedas;
	private String color;
	private int largo;
	private double ancho;
	private int peso;
	private boolean climatizador;
	private boolean tapiceriaCuero;
	private boolean gps;

	/**
	 * Constructor para la clase Vehiculo
	 * 
	 * @param ruedas numero de ruedas del vehículo
	 */
	public Vehiculo(int ruedas) {
		this.ruedas = ruedas;
		largo = 2;
		ancho = 1;
		peso = 800;
		color = "Sin Color";
	}
	
	/**
	 * Construye un vehículo, iniciando ruedas, largo, ancho y peso 
	 * @param ruedas
	 * @param largo
	 * @param ancho
	 * @param peso
	 */
	public Vehiculo(int ruedas, int largo, double ancho, int peso) {
		this.ruedas = ruedas;
		this.largo = largo;
		this.ancho = ancho;
		this.peso = peso;
		this.color = "Sin Color";
	}
	
	

	/**
	 * Añade extras al vehículo
	 * 
	 * @param climatizador Añade climatizador como extra
	 */
	public void setExtra(boolean climatizador) {
		this.climatizador = climatizador;
	}

	/**
	 * Añade extras al vehículo
	 * 
	 * @param climatizador   añade el extra climatizador al vehículo
	 * @param gps            añade el extra gps al vehículo
	 * @param tapiceriaCuero añade tapiceería de cuero al coche
	 */
	public void setExtra(boolean climatizador, boolean gps, boolean tapiceriaCuero) {
		this.climatizador = climatizador;
		this.gps = gps;
		this.tapiceriaCuero = tapiceriaCuero;
	}

	/**
	 * Indica si el vehículo tiene o no climatizador
	 * 
	 * @return String con un mensaje indicando la existencia o no de climatizador
	 */
	public String getExtra() {
		if (climatizador == true && gps == false && tapiceriaCuero == false) {
			return "Tu vehículo lleva el pack 1 de extras";
		} else if (climatizador == true && gps == true && tapiceriaCuero == true) {
			return "Tu vehículo lleva el pack 2 de extras";
		}else {
			return "La combinación de extras escogida no se admite";
		}

	}

	/**
	 * Establece un nuevo color para el objeto vehículo
	 * 
	 * @param color nuevo para el vehículo
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Devuelve el color del vehículo
	 * 
	 * @return color actual del vehículo
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Crea una cadena con los datos del vehículo
	 * 
	 * @return String con los datos del vehículo en un formato determinado
	 */
	public String getDatosVehiculo() {
		return "\n====Datos Vehículo==== \n" + "Nº ruedas:\t" + ruedas + "\n" + "Largo:\t\t" + largo + "m\n"
				+ "Ancho:\t\t" + ancho + "m\n" + "Peso:\t\t" + peso + "kg\n" + "Color:\t\t" + color + "\n"
				+ "======================";

	}

}
