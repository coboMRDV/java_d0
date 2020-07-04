package com.cursojava.poo;

/**
 * Date: July 3, 2020 Simple aplicaci�n para crear veh�culos
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
	 * @param ruedas numero de ruedas del veh�culo
	 */
	public Vehiculo(int ruedas) {
		this.ruedas = ruedas;
		largo = 2;
		ancho = 1;
		peso = 800;
		color = "Sin Color";
	}
	
	/**
	 * Construye un veh�culo, iniciando ruedas, largo, ancho y peso 
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
	 * A�ade extras al veh�culo
	 * 
	 * @param climatizador A�ade climatizador como extra
	 */
	public void setExtra(boolean climatizador) {
		this.climatizador = climatizador;
	}

	/**
	 * A�ade extras al veh�culo
	 * 
	 * @param climatizador   a�ade el extra climatizador al veh�culo
	 * @param gps            a�ade el extra gps al veh�culo
	 * @param tapiceriaCuero a�ade tapiceer�a de cuero al coche
	 */
	public void setExtra(boolean climatizador, boolean gps, boolean tapiceriaCuero) {
		this.climatizador = climatizador;
		this.gps = gps;
		this.tapiceriaCuero = tapiceriaCuero;
	}

	/**
	 * Indica si el veh�culo tiene o no climatizador
	 * 
	 * @return String con un mensaje indicando la existencia o no de climatizador
	 */
	public String getExtra() {
		if (climatizador == true && gps == false && tapiceriaCuero == false) {
			return "Tu veh�culo lleva el pack 1 de extras";
		} else if (climatizador == true && gps == true && tapiceriaCuero == true) {
			return "Tu veh�culo lleva el pack 2 de extras";
		}else {
			return "La combinaci�n de extras escogida no se admite";
		}

	}

	/**
	 * Establece un nuevo color para el objeto veh�culo
	 * 
	 * @param color nuevo para el veh�culo
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Devuelve el color del veh�culo
	 * 
	 * @return color actual del veh�culo
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Crea una cadena con los datos del veh�culo
	 * 
	 * @return String con los datos del veh�culo en un formato determinado
	 */
	public String getDatosVehiculo() {
		return "\n====Datos Veh�culo==== \n" + "N� ruedas:\t" + ruedas + "\n" + "Largo:\t\t" + largo + "m\n"
				+ "Ancho:\t\t" + ancho + "m\n" + "Peso:\t\t" + peso + "kg\n" + "Color:\t\t" + color + "\n"
				+ "======================";

	}

}
