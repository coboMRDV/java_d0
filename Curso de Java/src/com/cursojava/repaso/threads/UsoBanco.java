package com.cursojava.repaso.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UsoBanco {

	public static void main(String[] args) {
		Banco b = new Banco();

		for (int i = 0; i < 100; i++) {
			EjecutandoTransferencias r = new EjecutandoTransferencias(b, i, 2000);
			Thread t = new Thread(r);
			t.start();
		}

	}

}

class Banco {

	private final double[] cuentas;
	private Lock lock = new ReentrantLock();

	public Banco() {
		cuentas = new double[100];

		for (int i = 0; i < cuentas.length; i++) {
			cuentas[i] = 2000;
		}
	}

	public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) {

		lock.lock();
		try {
			if (cuentas[cuentaOrigen] < 0)
				return;

			System.out.println(Thread.currentThread());

			cuentas[cuentaOrigen] -= cantidad;
			System.out.printf("%10.2f€ desde la cuenta [%d] a la cuenta [%d]\n", cantidad, cuentaOrigen, cuentaDestino);
			System.out.println();
			cuentas[cuentaDestino] += cantidad;

			System.out.printf("Saldo total: %10.2f%n", getSaldoTotal());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}

	}

	public double getSaldoTotal() {
		double saldoTotal = 0;
		for (int i = 0; i < cuentas.length; i++) {
			saldoTotal += cuentas[i];

		}
		return saldoTotal;
	}

}

class EjecutandoTransferencias implements Runnable {

	private Banco banco = new Banco();
	private int cuentaOrigen;
	private double cantidadMaxima;

	public EjecutandoTransferencias(Banco banco, int cuentaOrigen, double cantidadMaxima) {
		this.banco = banco;
		this.cuentaOrigen = cuentaOrigen;
		this.cantidadMaxima = cantidadMaxima;
	}

	@Override
	public void run() {
		while (true) {
			int cuentaDestino = (int) (Math.random() * 100);
			double cantidadTransferir = cantidadMaxima * Math.random();

			banco.transferencia(cuentaOrigen, cuentaDestino, cantidadTransferir);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
