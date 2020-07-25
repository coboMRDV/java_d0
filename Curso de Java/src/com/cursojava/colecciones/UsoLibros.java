package com.cursojava.colecciones;

public class UsoLibros {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Java SE", "Juan", "11");
		Libro libro2 = new Libro("Java SE", "Juan", "12");
		
//		libro1 = libro2;
				
		Libro libro3 = new Libro("Ernest Cline" , "Ready Player One");
		Libro libro4 = new Libro("G. R. R. Martin", "Juego de Tronos");
		
		System.out.println(String.format("%-18s |%-20s |%-14s", "Título", "Autor", "ISBN"));
		System.out.println("-----------------------------------------------------------");
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		System.out.println(libro3.toString());
		System.out.println(libro4.toString());
		System.out.println("-----------------------------------------------------------");
		
		System.out.println();
		
		System.out.println();
		
		if(libro1.equals(libro2)) {
			System.out.println("Son iguales.");
			System.out.println("Hash libro 1: " + libro1.hashCode());
			System.out.println("Hash libro 2: " + libro2.hashCode());
		}else {
			System.out.println("NO son iguales.");
			System.out.println("Hash libro 1: " + libro1.hashCode());
			System.out.println("Hash libro 2: " + libro2.hashCode());
		}
	
	}

}
