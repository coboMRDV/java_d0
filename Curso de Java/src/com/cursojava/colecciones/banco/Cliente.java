package com.cursojava.colecciones.banco;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroCuenta == null) ? 0 : numeroCuenta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (numeroCuenta == null) {
			if (other.numeroCuenta != null)
				return false;
		} else if (!numeroCuenta.equals(other.numeroCuenta))
			return false;
		return true;
	}

	@Override
	public String toString() {
//		return "Cliente [nombre=" + nombre + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
		return getDatos();
	}
	
	
	
}
