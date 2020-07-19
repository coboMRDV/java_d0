package com.cursojava.programaciongenerica;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class UsoEmpleados {

	public static void main(String[] args) {

//		Empleado[] empleados = new Empleado[4];
//
//		empleados[0] = new Empleado("Antonio", 2300.5, 2005, 7, 5);
//		empleados[1] = new Empleado("Carlos", 5000.5, 2007, 6, 5);
//		empleados[2] = new Empleado("María", 2500.5, 2006, 11, 7);
//		empleados[3] = new Empleado("Ana", 7000, 2009, 5, 3);

		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new Empleado("Antonio", 2300.5, 2005, 7, 5));
		empleados.add(new Empleado("María", 2500.5, 2006, 11, 7));
		empleados.add(new Empleado("Ana", 2300.5, 2005, 7, 5));
		empleados.add(new Empleado("Jose", 2100.5, 2009, 5, 7));

//		empleados.trimToSize();
		/* ================= reemplazando elemento ================ */
		empleados.set(1, new Empleado("Jorge", 1900, 2003, 5, 6));
		empleados.add(new Empleado("Olga", 2000.5, 2009, 5, 7));
		empleados.remove(0);

//		System.out.println(empleados.get(3));

//		
//		for (Empleado empleado : empleados) {
//			System.out.println(empleado.toString());
//		}

//		for(int i = 0; i < empleados.size(); i ++) {
//			System.out.println(empleados.get(i).getDatos());
//		}

//		Empleado[] arrEmpleados = new Empleado[empleados.size()];
//		empleados.toArray(arrEmpleados);
//		for (Empleado empleado : arrEmpleados) {
//			System.out.println(empleado.getDatos());
//		}

		Iterator<Empleado> it = empleados.iterator();

		while (it.hasNext()) {
//			Empleado e = it.next();
			System.out.println(it.next().getDatos());
		}
	}
}

class Empleado {

	public static int idActual;
	private int id;
	private String nombre;
	private double sueldo;
	Date fechaContrato;

	public Empleado(String n, double s, int anio, int mes, int dia) {
		nombre = n;
		sueldo = s;
		id = idActual + 1;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
		fechaContrato = calendario.getTime();
		idActual++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String setTableHeader() {

		String str = String.format(
				"| %-2s | %-8s | %-7s | %-29s |\n" + "=========================================================", "id",
				"Nombre", "Sueldo", "Fecha de Contratación");

		return str;
	}

	public String getDatos() {

		return String.format("| %02d | %-8s | %.2f |  %-28s |", getId(), getNombre(), getSueldo(), getFechaContrato());

	}
}