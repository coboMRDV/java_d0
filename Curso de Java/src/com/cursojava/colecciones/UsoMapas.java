package com.cursojava.colecciones;

import java.util.HashMap;
import java.util.Map;

public class UsoMapas {

	public static void main(String[] args) {

		HashMap<String, Empleado> empleados = new HashMap<String, Empleado>();
		empleados.put("100", new Empleado("Juan"));
		empleados.put("101", new Empleado("Antonio"));
		empleados.put("102", new Empleado("María"));
		empleados.put("103", new Empleado("Lucía"));

		System.out.println(empleados);

		empleados.remove("101");
		empleados.put("103", new Empleado("Ana"));

		System.out.println(empleados);
		System.out.println();
		
		for(Map.Entry<String, Empleado> personaEmpleado : empleados.entrySet()) {
			String clave = personaEmpleado.getKey();
			Empleado valor = personaEmpleado.getValue();
			
			System.out.print("Clave:" + clave + " Valor:\n\t" + valor);
		}
	}
}

class Empleado {
	private final String nombre;
	private double salario;

	public Empleado(String nombre) {
		this.nombre = nombre;
		salario = 2000;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double newSalario) {
		salario = newSalario;
	}

	public String toString() {
		return String.format("Empleado[Nombre: %s, Salario: %.2f]\n", nombre, salario);
	}

}