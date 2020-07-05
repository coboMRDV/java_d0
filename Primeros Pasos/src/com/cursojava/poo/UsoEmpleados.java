package com.cursojava.poo;

import java.util.GregorianCalendar;

public class UsoEmpleados {


	public static void main(String[] args) {
		
		Empleado antonio = new Empleado("Antonio", 2300.5, 2005, 7, 15);
		Jefe ana = new Jefe("Ana", 2900, 2008, 8, 9);
		
		ana.setIncentivo(300.5);
		
		System.out.println(ana.getSueldo());
		
		
	}

}




 class Empleado{
//	Propiedades
	private final String nombre;
	private int id;
	private static int idSiguiente = 1;
	private double sueldo;
	private GregorianCalendar calendario;
	
		
//	Constructor
	public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
		id = idSiguiente;
		this.nombre = nombre;
		this.sueldo = sueldo;
		calendario = new GregorianCalendar(anio, mes, dia);
		idSiguiente ++;
	}
	
//	getIdSiguiente
	public static String getIdSiguiente() {
		return "\n***ID del siguiente empleado: " + idSiguiente + "***";
	}
	
//	getSueldo
	public double getSueldo() {
		return sueldo;
	}
	
//	getFechaAlta
	public GregorianCalendar getFechaAlta() {
		return calendario;
	}
	
//	getDatosEmpleado
	public String getDatosEmpleado() {
		return "ID: " + id + " \t| " + "Nombre: " + nombre ;

		}
	
//	setSueldo
	public void setSubeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}
}
 
// ============== FIN CLASE EMPLEADO =================//
 
 class Jefe extends Empleado {
//	 Propiedades
	 private double incentivo;
	 
	 
//	 Constructor
	public Jefe(String nombre, double sueldo, int anio, int mes, int dia) {
		super(nombre, sueldo, anio, mes, dia);
		
	}
	
//	setIncentivo
	public void setIncentivo(double b) {
		incentivo = b;
	}
	
//	getSueldo
	@Override
	public double getSueldo() {
		double sueldoJefe = super.getSueldo();
		return sueldoJefe + incentivo;
	}

 }