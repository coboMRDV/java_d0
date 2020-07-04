package com.cursojava.ejercicios;

import java.util.Random;

/**
* Crea una clase capaz de crear cuentas corrientes bancarias con las siguientes características:
* <ul>
<li> Nombre de clase: CuentaCorriente.</li>
 <li>Propiedades:
 	<ul>
 		<li>saldo (double).</li>
 		<li>nombreTitular (String).</li>
 		<li>numeroCuenta (long).</li>
 	</ul>
 	<li>Constructor con dos parámetros:
 	<ul>
 		<li>nombreTitular (String)</li>
 		<li>saldo (double)</li>
 		<li>Este constructor se encargará de establecer un nombre de titular para la cuenta
	corriente, un saldo inicial y asignará un nº a la cuenta corriente de tipo long de
	forma aleatoria</li>
 	</ul>
 	</li>
 	<li>Métodos:
 		<ul>
 			<li>2 setter: permitirán hacer ingresos y reintegros en un objeto de tipo
	CuentaCorriente.</li>
 			<li>2 getter: Permitirán obtener saldo de la cuenta y datos generales de una
	CuentaCorriente.</li>
 			<li>1 método adicional: permitirá realizar transferencias de dinero de una cuenta
	a otra.</li>
 		</ul>
 	</li>

	 
</ul>
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
	/**
	 * Constructor para la clase Cuenta Corriente
	 * @param  nombreTitular  Nombre del titular de la cuenta
	 * @param  saldo double	 Saldo con el que se va a iniciar la cuenta
	 */
	public CuentaCorriente(String nombreTitular, double saldo) {
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
		numeroCuenta = Math.abs(new Random().nextLong()); 
	}
	
	
	/*Getters*/
	/**
	 * Devuelve el saldo actual de la cuenta corriente
	 * @return double con el saldo actual de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}
	
	
	
	/*Setters*/
	/**
	 * Permite hacer un ingreso en la cuenta
	 * sumando la cantidad de dinero indicada al 
	 * saldo actual
	 * 
	 * @param dineroIngresado  Dinero a ingresar
	 */
	public void ingreso(double dineroIngresado) {
		if(dineroIngresado > 0) {
			saldo += dineroIngresado;
		}else {
			System.out.println(
					"No se puede ingresar una cantidad negativa");
		}
		
	}
	
	/**
	 * Permite hacer una transferencia a otra cuenta
	 * restando la cantidad de dinero indicada al
	 * saldo actual
	 * @param dineroTransferido Dinero que se va a restar a la cuenta
	 */
	public void transferencia(double dineroTransferido) {
		if(dineroTransferido > 0) {
			saldo -= dineroTransferido;
		}else {
			System.out.println(
					"No se puede hacer una trasferencia"
					+ " con una candidad negativa");
		}
	}
	
	
	/**
	 * Realiza una transferencia de una cuenta a otra 
	 * @param otraCuenta a la cual se realiza la transferencia
	 * @param dinero que se suma al saldo de una cuenta y se resta
	 * de la otra
	 */
	public void transferenciaOtraCuenta(CuentaCorriente otraCuenta, double dinero) {
		otraCuenta.ingreso(dinero);
		this.transferencia(dinero);
	}
	
	
	/**
	 * Despliega los datos de la cuenta corriente en consola
	 * @return String datos de la cuenta en un formato específico
	 * 
	 * ================================================<br>
	 * #Nº Cuenta Corriente:	XXXXXXXXXXXXXXXX	<br>
	 * #Nombre del Titular:	XXXXX XXXXXX			<br>
	 * #Saldo actual:		$XXXXXX					<br>
	 * ================================================
	 */
	public String datosCuenta() {
		return 	"================================================\n"+
				"#Nº Cuenta Corriente:\t" + numeroCuenta + "\n" +
				"#Nombre del Titular:\t" + nombreTitular + "\n" +
				"#Saldo actual:\t\t" +"$"+ saldo +
				"\n"+
				"================================================\n";
	}
	
	
}
