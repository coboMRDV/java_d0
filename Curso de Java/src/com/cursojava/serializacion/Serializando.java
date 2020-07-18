package com.cursojava.serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializando {

	public static void main(String[] args) {
		Administrador jefe = new Administrador("Juan", 80000, 2005, 12, 15);

		jefe.setIncentivo(5000);

		Empleado[] personal = new Empleado[3];

		personal[0] = jefe;
		personal[1] = new Empleado("Ana", 25000, 2008, 10, 1);
		personal[2] = new Empleado("Luis", 18000, 2012, 9, 15);

		for (int i = 0; i < personal.length; i++) {
			System.out.println(personal[i].toString());
		}

		try {

			/* ================= generando objeto serializado================ */
//			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//					new FileOutputStream("c:/users/cobo/dropbox/TestFolder/serializedOjectTest.dat"));
//
//			objectOutputStream.writeObject(personal);
//			
//			objectOutputStream.close();

			/* ================= leyendo objeto serializado ================ */
			ObjectInputStream objectInputStream = new ObjectInputStream(
					new FileInputStream("c:/users/cobo/dropbox/TestFolder/serializedOjectTest.dat"));

			Empleado[] arrObj = (Empleado[]) objectInputStream.readObject();

			for (int i = 0; i < arrObj.length; i++) {
				System.out.println(arrObj[i].toString());
			}

			objectInputStream.close();
			/* ================= --------------------------- ================ */
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private double sueldo;
	Date fechaContrato;

	public Empleado(String n, double s, int anio, int mes, int dia) {
		nombre = n;
		sueldo = s;

		GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
		fechaContrato = calendario.getTime();
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

	public String toString() {

		return String.format("Nombre: %-4s | Sueldo: %.2f | Fecha de Contratación: " + getFechaContrato(), getNombre(),
				getSueldo());

	}
}

class Administrador extends Empleado {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double incentivo;

	public Administrador(String n, double s, int anio, int mes, int dia) {
		super(n, s, anio, mes, dia);
		incentivo = 0;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(int incentivo) {
		this.incentivo = incentivo;
	}

	public double getSueldo() {
		return super.getSueldo() + incentivo;
	}

}
