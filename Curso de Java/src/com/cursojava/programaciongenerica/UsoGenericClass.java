package com.cursojava.programaciongenerica;

public class UsoGenericClass {

	public static void main(String[] args) {
		GenericClass<String> miObjeto1 = new GenericClass<String>();
		miObjeto1.setObject("Cobo");
		
		System.out.println(miObjeto1.getObject());
		
		
		GenericClass<Persona> miObjeto2 = new GenericClass<Persona>();
		Persona ella = new Persona("María");
		miObjeto2.setObject(ella);
		
		System.out.println(miObjeto2.getObject());
	}

}


class Persona{
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return nombre;
	}
	
}