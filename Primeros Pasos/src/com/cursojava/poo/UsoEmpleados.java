package com.cursojava.poo;

public class UsoEmpleados {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Ana");
		Empleado empleado2 = new Empleado("Antonio");
		Empleado empleado3 = new Empleado("María");
		Empleado empleado4 = new Empleado("Jorge");
		
//		System.out.println(empleado1.getDatosEmpleado());
		
		empleado1.setSeccion("RRHH");
		
		System.out.println(empleado1.getDatosEmpleado());
		System.out.println(empleado2.getDatosEmpleado());
		System.out.println(empleado3.getDatosEmpleado());
		System.out.println(empleado4.getDatosEmpleado());
		
		System.out.println(Empleado.getIdSiguiente());
						
	}

}


 class Empleado{
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
		
	public Empleado(String nombre) {
		this.nombre = nombre;
		this.seccion = "Administración";
		id = idSiguiente;
		
		Empleado.idSiguiente ++;
	}
		
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public static String getIdSiguiente() {
		return "\n***ID del siguiente empleado: " + idSiguiente + "***";
	}
	
	public String getDatosEmpleado() {
		return "ID: " + id + " \t| " + "Nombre: " + nombre + " | Sección: " + seccion ;
		
		
//				"ID:\t\t" 		+ id + "\n" +
//				"Nombre:\t\t" 	+ nombre + "\n" +
//				"Sección:\t" 	+ seccion + "\n"+
//				"===============================";
		}
}