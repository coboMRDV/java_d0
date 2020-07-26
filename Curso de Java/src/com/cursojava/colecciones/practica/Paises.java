package com.cursojava.colecciones.practica;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Dos linkedlists. Países y capitales
 * 
 * E.g. españa, colombia, méxico, perú  -  madrid, bogotá, d.f., lima
 * 
 * 1.- Meter las capitales en la lista de países, cada capital a continuación de su país
 * (españa madrid, colombia bogotá...)
 * 
 * 2.- De la lista de capitales, borrar las pares, (bogotá y lima)
 * 
 * 
 * 
 */

public class Paises {

	public static void main(String[] args) {
		LinkedList<String> paises = new LinkedList<String>();
		LinkedList<String> capitales = new LinkedList<String>();
		
		paises.add("España");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Perú");
		
		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("México D.F.");
		capitales.add("Lima");
		
		
		ListIterator<String> iteradorPaises = paises.listIterator();
		ListIterator<String> iteradorCapitales = capitales.listIterator();
		

		while(iteradorPaises.hasNext()) {
			iteradorPaises.next();
			iteradorPaises.add(iteradorCapitales.next());

		}
		
		iteradorCapitales = capitales.listIterator();
		while(iteradorCapitales.hasNext()) {
			iteradorCapitales.next();
			iteradorCapitales.next();
			iteradorCapitales.remove();
		}
		
		System.out.println(paises);
		System.out.println(capitales);
		
	}
	
	

}
