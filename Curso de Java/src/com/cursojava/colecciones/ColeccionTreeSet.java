package com.cursojava.colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class ColeccionTreeSet {

	public static void main(String[] args) {
		
//		TreeSet<String> ordenaGente = new TreeSet<String>();
//
//		ordenaGente.add("Oscar");
//		ordenaGente.add("Mar�a");
//		ordenaGente.add("Ana");
//		ordenaGente.add("Pilar");
//
//		for (String nombre : ordenaGente) {
//			System.out.println(nombre);
//		}

		Producto comparadorProductos = new Producto();
		
		TreeSet<Producto> ordenaProductos = new TreeSet<Producto>(comparadorProductos);

		ordenaProductos.add(new Producto(3, "�sta es la descripci�n del tercer producto"));
		ordenaProductos.add(new Producto(7, "S�ptimo"));
		ordenaProductos.add(new Producto(2, "Segundo producto"));

		for (Producto p : ordenaProductos) {
			System.out.println(p.getNumProducto() + " - " + p.getDescripci�n());
		}
		System.out.println();
		System.out.println(ordenaProductos);
	}
}

class Producto implements Comparable<Producto>, Comparator<Producto> {
	private int numProducto;
	private String descripci�n;

	public Producto() {}
	
	public Producto(int numProducto, String descripci�n) {
		this.numProducto = numProducto;
		this.descripci�n = descripci�n;
	}

	public int getNumProducto() {
		return numProducto;
	}

	public String getDescripci�n() {
		return descripci�n;
	}

	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
	}

	@Override
	public int compareTo(Producto o) {
		return numProducto - o.numProducto;
	}

	public String toString() {
		return String.format("%s.-%s", numProducto, descripci�n);

	}

	@Override
	public int compare(Producto arg0, Producto arg1) {
		int r = 0;
		
		if(arg0.descripci�n.length() > arg1.descripci�n.length()) {
			r = 1;
		}else if (arg0.descripci�n.length() < arg1.descripci�n.length()) {
			r = -1;
		}
		
		return r;
	}

}