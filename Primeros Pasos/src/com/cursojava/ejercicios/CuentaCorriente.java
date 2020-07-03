package com.cursojava.ejercicios;

import java.util.Random;

/**
* Crea una clase capaz de crear cuentas corrientes bancarias con las siguientes características:
• Nombre de clase: CuentaCorriente.
• Propiedades:
o saldo (double).
o nombreTitular (String).
o numeroCuenta (long).
• Constructor con dos parámetros:
o nombreTitular (String)
o saldo (double)
o Este constructor se encargará de establecer un nombre de titular para la cuenta
corriente, un saldo inicial y asignará un nº a la cuenta corriente de tipo long de
forma aleatoria
• Métodos:
o 2 setter: permitirán hacer ingresos y reintegros en un objeto de tipo
CuentaCorriente.
o 2 getter: Permitirán obtener saldo de la cuenta y datos generales de una
CuentaCorriente.
o 1 método adicional: permitirá realizar transferencias de dinero de una cuenta
a otra.
Crea una clase principal con el nombre de UsoCuenta. Crea dos instancias de CuentaCorriente
con el nombre de Cuenta1 y Cuenta2. Haz una transferencia de Cuenta1 a Cuenta2 por importe
de 200 €. Imprime los datos de las dos cuentas en consola
 * */


public class CuentaCorriente {
//	Propiedades
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;
	
//	Constructor
	public CuentaCorriente(String nombreTitular, double saldo) {
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
		numeroCuenta = Math.abs(new Random().nextLong()); 
	}
	
	
	/*Getters*/
	public double getSaldo() {
		return saldo;
	}
	
	public String datosCuenta() {
		return 	"Nº Ccuenta Corriente\t" + numeroCuenta + "\n" +
				"Nombre del Titular:\t" + nombreTitular + "\n" +
				"Saldo actual:\t\t" +"$"+ saldo +
				"\n"+
				"================================================"
				
				;
				
	}
	
	
	/*Setters*/
	/**
	 * Permite hacer un ingreso en la cuenta
	 * sumando la cantidad de dinero indicada al 
	 * saldo actual
	 * 
	 * @param ingreso - Dinero a ingresar
	 */
	public void ingreso(double dineroIngresado) {
		saldo += dineroIngresado;
	}
	
	/**
	 * Permite hacer una transferencia a otra cuenta
	 * restando la cantidad de dinero indicada al
	 * saldo actual
	 * @param transferencia
	 */
	public void transferencia(double dineroTransferido) {
		saldo -= dineroTransferido;
	}
	
	
	/**
	 * Realiza una transferencia de una cuenta a otra 
	 * @param otraCuenta Objeto cuenta a quien se le hace una transferencia
	 * @param dinero transferido que se suma al saldo de una cuenta y se resta
	 * de la otra
	 */
	public void transferenciaOtraCuenta(CuentaCorriente otraCuenta, double dinero) {
		otraCuenta.ingreso(dinero);
		this.transferencia(dinero);
	}
	
}
