package com.cursojava.poo;

import java.util.GregorianCalendar;

public class UsoEmpleados {


	public static void main(String[] args) {
		
//		Empleado antonio = new Empleado("Antonio", 2300.5, 2005, 7, 15);
//		Jefe ana = new Jefe("Ana", 2900, 2008, 8, 9);
//		
//		ana.setIncentivo(300.5);
//		
//		System.out.println(ana.getSueldo());
		
		Jefe juan = new Jefe("Juan", 8000, 2013, 8, 5);
		juan.setIncentivo(200);
		
		Empleado[] empleados = new Empleado[6];
		
		empleados[0] = new Empleado("Antonio", 2300.5, 2005, 7, 15);
		empleados[1] = new Empleado("Carlos", 5000.5, 2007, 6, 15);
		empleados[2] = new Empleado("María", 2500.5, 200, 11, 7);
		empleados[3] = new Empleado("Ana", 7000, 2009, 5, 3);
		empleados[4] = juan;
		empleados[5] = new Jefe("Isabel", 8000, 2007, 4, 2);
		
		Jefe isabel = (Jefe)empleados[5];
		isabel.setIncentivo(500);
				
//		Empleado patricia = new Jefe("Patricia", 2500, 2007, 5, 6);
//		Jefe patriciaDirectora = (Jefe) patricia ;
						
		for(Empleado e : empleados) {
			System.out.println(e.getDatosEmpleado() + " | Saldo: " + e.getSueldo());
		}
		
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
		return "ID: " + id + " | " + "Nombre: " + nombre ;

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