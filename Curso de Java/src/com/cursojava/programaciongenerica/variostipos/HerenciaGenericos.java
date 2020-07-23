package com.cursojava.programaciongenerica.variostipos;

public class HerenciaGenericos {

	public static void main(String[] args) {
		
//		Empleado empleado15248;
//		
//		Jefe sara = new Jefe("Sara", 27, 3750);
//		
//		empleado15248 = sara;
		
		VariosTipos<Jefe> sara = new VariosTipos<Jefe>();
		
		VariosTipos.imprimirTrabajador(sara);
		
		
//		empleado15248 = sara;
		
		
	}

}
