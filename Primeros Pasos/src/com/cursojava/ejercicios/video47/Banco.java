package com.cursojava.ejercicios.video47;

/*En este ejercicio se trata de crear una clase capaz de crear objetos de tipo “Cuenta Corriente”
como si de un banco se tratase. La clase tendrá el nombre de “CuentaCorriente” y construirá
objetos de tipo cuenta corriente con tres propiedades:
1. Nombre del titular. Este dato será de tipo String
2. Saldo inicial de la cuenta corriente. Este dato será de tipo doublé.
3. Nº de cuenta corriente. Este dato será de tipo Long y lo creará la clase de forma aleatoria
durante la ejecución del programa
Además, la clase tendrá los correspondientes métodos setters y getters que deberán realizar las
siguientes tareas:
• Poder ingresar dinero en una cuenta
• Poder sacar dinero de una cuenta
• Devolver el saldo de una cuenta
• Devolver los datos de una cuenta (titular, saldo y nº de cuenta)
• Hacer transferencias de dinero entre dos cuentas
Ya sabéis que en programación ante un problema planteado, las soluciones pueden ser casi
infinitas. Elabora el programa según tu criterio. Si funciona bien, lo has conseguido. No obstante,
se ofrece al final de este documento una posible implementación del programa*/

public class Banco {

	public static void main(String[] args) {
		
		Cuenta c1 = new Cuenta("Cobo", 2000);
		Cuenta c2 = new Cuenta("Laura", 8000);
		
		c1.ingresarEfectivo(800);
		
		Cuenta.realizarTransferencia(c1, c2, 600);
		
		System.out.println(c1.getDatos());
		System.out.println(c2.getDatos());

	}

}

class Cuenta{
	private long nCuenta;
	private final String nombre;
	private double saldo;
	
	
	public Cuenta(String nombre, double saldo) {
		nCuenta = (long) (Math.random() * (999999999 - 111111111) + 111111111);
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public void ingresarEfectivo(double efectivo) {
		saldo += efectivo;
	}
	
	public void retirarEfectivo(double efectivo) {
		saldo -= efectivo;
	}
	
	
	public static void realizarTransferencia(Cuenta c1, Cuenta c2, double efectivo) {
		if(efectivo < 0 ) {
			System.out.println(
					"No es posible realizar una transferencia "
					+ "de una cantidad negativa");
		}else {
			c1.retirarEfectivo(efectivo);
			c2.ingresarEfectivo(efectivo);
			System.out.println("Transferencia realizada correctamente");
		}
	}
	
	public long getNumeroCuenta() {
		return nCuenta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
		
	public String getDatos() {
		return 
				"\nNº Cuenta\t|Nombre\t|Saldo\t\n"+
				"---------------------------------\n"+
				nCuenta + "\t|" + nombre + "\t" + saldo + "€\t\n" +
				"=================================\n"
				;
	}
	
	
}
