package com.cursojava.ejercicios.video47;

/**
 * Alumno.java Crea alumnos de un colegio
 * 
 * Ejercicio curso java
 * 
 * @author Cobo
 *
 */
public class Alumno {
	/**
	 * Propiedades
	 */
	private final String nombre;
	private double notaMedia;
	private int nAlumno;

	/**
	 * Construye un alumno
	 * 
	 * @param nombre    String Nombre del alumno
	 * @param notaMedia double Con la nota media del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		this.nombre = nombre;
		this.notaMedia = notaMedia;
		nAlumno = Colegio.getNalumno();
		
	}

	/**
	 * Establece una nueva nota media para el alumno
	 * 
	 * @param notaMedia double nueva nota media para el alumno
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	/**
	 * Devuelve el nombre del alumno
	 * 
	 * @return String Noombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Devuelve el número asignado 
	 * a este alumno
	 * 
	 * @return int numero de alumno
	 */
	public int getNumeroAlumno() {
		return nAlumno;
	}
	
	/**
	 * Devuelve la nota media de este alumno
	 * 
	 * 
	 * @return double nota media
	 */
	public double getNotaMedia() {
		return notaMedia;
	}
	
	/**
	 * Devuelve un string con los datos
	 * del objeto de la clase alumno
	 */
	@Override
	public String toString() {
		return 
				"Alumno [Nombre: "+ nombre +" | Nota Media: "+ notaMedia +" ]"
				;
	}

}
