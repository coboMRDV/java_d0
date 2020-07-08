package com.cursojava.poo.abstractas;

import java.util.Date;

public abstract class Persona {

	private String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String getDescripcion();

	
	
}//	 CLASE EMPLEADO ================================
class Empleado extends Persona implements Comparable, ParaTrabajadores{
	
	private double sueldo;
	private Date fechaAlta;
	
	
	public Empleado(String nombre, Date fechaAlta, double sueldo) {
		super(nombre);
		this.fechaAlta = fechaAlta;
		this.sueldo = sueldo;
		
		
	}

	@Override
	public String getDescripcion() {
		
		return String.format(
				"Nombre: %-12s | "
				+ "Sueldo: %-7s | "
				+ "Fecha de Alta: %-30s", 
				this.getNombre(), sueldo+"€", fechaAlta)
				;
	}

	@Override
	public int compareTo(Object arg0) {
		
		Empleado otroEmpleado = (Empleado)arg0;
		int result = -1;
		
		if(this.sueldo > otroEmpleado.sueldo) {
			result = 1;
		}else if(this.sueldo == otroEmpleado.sueldo) {
			result = 0;
		}
		
		return result;
	}

	@Override
	public double setBonus(double gratificacion) {
		
		return ParaTrabajadores.BONUS + gratificacion;
	}


	
}//	CLASE JEFE ==================================
class Jefe extends Empleado implements ParaJefes{
		
	private String cargo;
	
	public Jefe(String nombre, Date fechaAlta, double sueldo) {
		super(nombre, fechaAlta, sueldo);
		
	}
	
	public void setIncentivo(double incentivo) {
	}
	
	public String getDescripcion() {
		
		return String.format(super.getDescripcion() +
				"| Cargo: %-10s", getCargo()) 
				;
	}

	@Override
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String getCargo() {
		return cargo;
	}

	@Override
	public double setBonus(double gratificacion) {
		double prima = 2000;
		
		return prima + gratificacion + ParaTrabajadores.BONUS;
	}
	
	
}//	CLASE ALUMNO ============
class Alumno extends Persona{
	
	private String optativas;
	private String aula;
	
	
	public Alumno(String nombre, String optativas, String aula) {
		super(nombre);
		this.optativas = optativas;
		this.aula = aula;
	}

	@Override
	public String getDescripcion() {
		
		return String.format(
				"Nombre: %-8s | "
				+ "Optativas: %-8s | "
				+ "%s", 
				this.getNombre(), optativas, aula)
				;
	}
	
}


