package com.cursojava.ejercicios.video42;

public class UsoCuenta {

	public static void main(String[] args) {
		
		CuentaCorriente cuenta1 = new CuentaCorriente("Cobo Morera", 3000);
		CuentaCorriente cuenta2 = new CuentaCorriente("Laura Lewis", 8000);
		
		cuenta1.transferenciaOtraCuenta(cuenta2, 200);
		
		System.out.println(cuenta1.datosCuenta());
		System.out.println(cuenta2.datosCuenta());

	}

}
