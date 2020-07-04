package com.cursojava.ejercicios;

public class Paquete {
//	Propiedades
	int referencia;
	double peso;
	String dniRemitente;
	short prioridad; // (0|1|2 - Normal|Alta|Urgente)
	
	
//	Constructor
	public Paquete(int referencia, double peso, String dniRemitente, short prioridad) {
		this.referencia = referencia;
		this.peso = peso;
		this.dniRemitente = dniRemitente;
		this.prioridad = prioridad;
	}
	
//	Métodos Setters
	public void setPeso(double nuevoPeso) {
		this.peso = nuevoPeso;
	}
	
	public void setPrioridad(short nuevaPrioridad) {
		this.prioridad = nuevaPrioridad;
	}
	
//	Métodos Getters
	
	public double getPeso() {
		return peso;
	}
	
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
