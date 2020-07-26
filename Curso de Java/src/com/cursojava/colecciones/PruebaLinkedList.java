package com.cursojava.colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {

	public static void main(String[] args) {
		LinkedList<String>personas = new LinkedList<String>();
		
		personas.add("Ana");
		personas.add("Antonio");
		personas.add("Sara");
		personas.add("Pedro");
		
		System.out.println(personas.size());
		
		ListIterator<String> it = personas.listIterator();
		
		it.next();
		it.add("Juan");
		
		for (String p: personas) {
			System.out.println(p);
		}
	}
}
