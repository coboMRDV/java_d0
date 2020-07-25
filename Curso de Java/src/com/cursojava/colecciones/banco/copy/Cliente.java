package com.cursojava.colecciones.banco.copy;

public class Cliente {
	private final String nombre;
	private final String numeroCuenta;
	private double saldo;
	
	public Cliente(String nombre, String numeroCuenta, double saldo) {
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNumeroCuente() {
		return numeroCuenta;
	}
	
	public String getDatos() {
		return String.format("|%-5s| %-14s | %11.2f€ |", numeroCuenta, nombre, saldo);
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
	}
	
	
	
}
