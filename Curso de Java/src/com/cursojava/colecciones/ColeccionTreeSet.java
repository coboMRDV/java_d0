package com.cursojava.colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class ColeccionTreeSet {

	public static void main(String[] args) {
		
//		TreeSet<String> ordenaGente = new TreeSet<String>();
//
//		ordenaGente.add("Oscar");
//		ordenaGente.add("María");
//		ordenaGente.add("Ana");
//		ordenaGente.add("Pilar");
//
//		for (String nombre : ordenaGente) {
//			System.out.println(nombre);
//		}

		Producto comparadorProductos = new Producto();
		
		TreeSet<Producto> ordenaProductos = new TreeSet<Producto>(comparadorProductos);

		ordenaProductos.add(new Producto(3, "Ésta es la descripción del tercer producto"));
		ordenaProductos.add(new Producto(7, "Séptimo"));
		ordenaProductos.add(new Producto(2, "Segundo producto"));

		for (Producto p : ordenaProductos) {
			System.out.println(p.getNumProducto() + " - " + p.getDescripción());
		}
		System.out.println();
		System.out.println(ordenaProductos);
	}
}

class Producto implements Comparable<Producto>, Comparator<Producto> {
	private int numProducto;
	private String descripción;

	public Producto() {}
	
	public Producto(int numProducto, String descripción) {
		this.numProducto = numProducto;
		this.descripción = descripción;
	}

	public int getNumProducto() {
		return numProducto;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	@Override
	public int compareTo(Producto o) {
		return numProducto - o.numProducto;
	}

	public String toString() {
		return String.format("%s.-%s", numProducto, descripción);

	}

	@Override
	public int compare(Producto arg0, Producto arg1) {
		int r = 0;
		
		if(arg0.descripción.length() > arg1.descripción.length()) {
			r = 1;
		}else if (arg0.descripción.length() < arg1.descripción.length()) {
			r = -1;
		}
		
		return r;
	}

}