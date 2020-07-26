package com.cursojava.colecciones.practica;

import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Dos linkedlists. Pa�ses y capitales
 * 
 * E.g. espa�a, colombia, m�xico, per�  -  madrid, bogot�, d.f., lima
 * 
 * 1.- Meter las capitales en la lista de pa�ses, cada capital a continuaci�n de su pa�s
 * (espa�a madrid, colombia bogot�...)
 * 
 * 2.- De la lista de capitales, borrar las pares, (bogot� y lima)
 * 
 * 
 * 
 */

public class Paises {

	public static void main(String[] args) {
		LinkedList<String> paises = new LinkedList<String>();
		LinkedList<String> capitales = new LinkedList<String>();
		
		paises.add("Espa�a");
		paises.add("Colombia");
		paises.add("M�xico");
		paises.add("Per�");
		
		capitales.add("Madrid");
		capitales.add("Bogot�");
		capitales.add("M�xico D.F.");
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
