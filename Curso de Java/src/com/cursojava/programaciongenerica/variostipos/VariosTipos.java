package com.cursojava.programaciongenerica.variostipos;

public class VariosTipos<T> {
	
	private T primero;

	public VariosTipos() {
		primero = null;
	}
	
	
	public static void imprimirTrabajador(VariosTipos<? extends Empleado>e) {
		Empleado primero = e.getPrimero();
		System.out.println(primero);
	}
	
	
	public void setPrimero(T nuevoValor) {
		primero = nuevoValor;
	}
	
	
	public T getPrimero() {
		return primero;
	}
	
}
