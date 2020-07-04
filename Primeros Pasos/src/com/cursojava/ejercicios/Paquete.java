package com.cursojava.ejercicios;

public class Paquete {
//	Propiedades
	int referencia;
	double peso;
	String dniRemitente;
	short prioridad; // (0|1|2 - Normal|Alta|Urgente)
	
	
//	Constructor
	/**
	 * Crea un objeto de la clase paquete
	 * @param referencia del paquete
	 * @param peso en kilos
	 * @param dniRemitente DNI de la persona que realiza el envío
	 * @param prioridad 0 | 1 | 2 - Normal | Alta | Urgente
	 */
	public Paquete(int referencia, double peso, String dniRemitente, short prioridad) {
		this.referencia = referencia;
		this.peso = peso;
		this.dniRemitente = dniRemitente;
		this.prioridad = prioridad;
	}
	
//	Métodos Setters
	/**
	 * Establece un nuevo peso
	 * @param nuevoPeso del paquete
	 */
	public void setPeso(double nuevoPeso) {
		this.peso = nuevoPeso;
	}
	
	/**
	 * Establece una nueva prioridad
	 * @param nuevaPrioridad para el paquete
	 */
	public void setPrioridad(short nuevaPrioridad) {
		this.prioridad = nuevaPrioridad;
	}
	
//	Métodos Getters
	
	/**
	 * Devuelve el peso del paquete
	 * @return double peso
	 */
	public double getPeso() {
		return peso;
	}
	
	/**
	 * Devuelve la prioridad del paquete
	 * @return String prioridad
	 */
	public String getPrioridad() {
		if(prioridad == 0) {
			return "Normal";
		}else if(prioridad == 1) {
			return "Alta";
		}else {
			return "Urgente";
		}
		
	}
	

}
