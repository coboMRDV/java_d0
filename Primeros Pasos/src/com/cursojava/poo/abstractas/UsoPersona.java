package com.cursojava.poo.abstractas;

import java.util.Arrays;
import java.util.Date;

public class UsoPersona {

	public static void main(String[] args) {
//		Empleado juan= new Empleado("Juan", new Date(780943124), 2500);
//		System.out.println(jacobo.getNombre());
//		System.out.println(jacobo.getDescripcion());
//
//		Jefe ana = new Jefe("Ana", new Date(987743224), 3500);
//		ana.setCargo("Directora Comercial");
//		System.out.println(ana.getNombre());
//		System.out.println(ana.getDescripcion());
//
//		Alumno maria = new Alumno("María", "Dibujo", "Aula 5");
//		System.out.println(maria.getNombre());
//		System.out.println(maria.getDescripcion());
//
//		Jefe david= new Jefe("David", new Date(999999999), 4800);
//		david.setCargo("Director de RRHH");
//		System.out.println(david.getNombre());
//		System.out.println(david.getDescripcion());
		
		Empleado[] empleados = new Empleado[5];
				
		empleados[0] = new Empleado("Juan", new Date(67896789), 2500);
		empleados[1] = new Empleado("María", new Date(67896789), 1500);
		empleados[2] = new Empleado("Ana", new Date(67896789), 3500);
		empleados[3] = new Empleado("Sandra", new Date(67896789), 6000);
		empleados[4] = new Empleado("Antonio", new Date(67896789), 2100);
		
		
		
		Arrays.sort(empleados);
		
		for(Empleado e: empleados) {
			System.out.println(e.getDescripcion());
		}
		
		Jefe manuel = new Jefe("Manuel", new Date(173890471), 5000);
		Empleado sonia = new Empleado("Sonia", new Date(78907890), 3000);
		
		System.out.println(String.format(
				"El trabajador %s tiene un bonus de %.2f" , 
				sonia.getNombre(), sonia.setBonus(500)));
			
	}

}
