package com.cursojava.usothreads;

import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class UsoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame marco = new MarcoRebote();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);

	}

}

//Movimiento de la pelota-----------------------------------------------------------------------------------------

class Pelota {

	// Mueve la pelota invirtiendo posición si choca con límites

	// Forma de la pelota en su posición inicial

	private static final int TAMX = 50;

	private static final int TAMY = 50;

	private double x = 0;

	private double y = 0;

	private double dx = 1;

	private double dy = 1;

	// Forma de la pelota en su posición inicial

	public Ellipse2D getShape() {

		return new Ellipse2D.Double(x, y, TAMX, TAMY);

	}

	// Mueve la pelota invirtiendo posición si choca con límites

	public void mueve_pelota(Rectangle2D limites) {

		x += dx;

		y += dy;

		if (x < limites.getMinX()) {

			x = limites.getMinX();

			dx = -dx;
		}

		if (x + TAMX >= limites.getMaxX()) {

			x = limites.getMaxX() - TAMX;

			dx = -dx;
		}

		if (y < limites.getMinY()) {

			y = limites.getMinY();

			dy = -dy;
		}

		if (y + TAMY >= limites.getMaxY()) {

			y = limites.getMaxY() - TAMY;

			dy = -dy;

		}

	}

}

// Lámina que dibuja las pelotas----------------------------------------------------------------------

class LaminaPelota extends JPanel {

	// Añadimos pelota a la lámina

	/**
	 * 
	 */
	private static final long serialVersionUID = 3413416312228720488L;

	private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();

	public void add(Pelota b) {

		pelotas.add(b);
	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		for (Pelota b : pelotas) {

			g2.fill(b.getShape());
		}

	}
}

//Marco con lámina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame {
	private static final long serialVersionUID = -5389542801666480266L;
	Thread t;
	private LaminaPelota lamina;

	public MarcoRebote() {
		setBounds(600, 300, 400, 350);
		setTitle("Rebotes");

		lamina = new LaminaPelota();
		add(lamina, BorderLayout.CENTER);

		JPanel laminaBotones = new JPanel();

		ponerBoton(laminaBotones, "Dale!", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				comienza_el_juego();
			}

		});

		ponerBoton(laminaBotones, "Salir", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				System.exit(0);

			}

		});

		ponerBoton(laminaBotones, "Parar", new ActionListener() {

			public void actionPerformed(ActionEvent evento) {

				parar();

			}

		});

		add(laminaBotones, BorderLayout.SOUTH);
	}

	// Ponemos botones

	public void ponerBoton(Container c, String titulo, ActionListener oyente) {

		JButton boton = new JButton(titulo);
		c.add(boton);
		boton.addActionListener(oyente);

	}

	// Añade pelota y la bota 1000 veces

	public void comienza_el_juego() {
		Pelota pelota = new Pelota();
		lamina.add(pelota);
		Runnable r = new PelotaThreads(pelota, lamina);

		t = new Thread(r);
		t.start();

	}

	public void parar() {
//		t.stop();
		t.interrupt();
	}

}

/* ================= clase con el thread ================ */
class PelotaThreads implements Runnable {

	private Pelota pelota;
	private Component lamina;

	public PelotaThreads(Pelota pelota, Component lamina) {

		this.pelota = pelota;
		this.lamina = lamina;
	}

	@Override
	public void run() {
		System.out.println("Estado del hilo antes de comenzar la tarea: " + Thread.currentThread().isInterrupted());
		while (!Thread.currentThread().isInterrupted()) {
			pelota.mueve_pelota(lamina.getBounds());
			lamina.paint(lamina.getGraphics());
		}
		System.out.println("Estado del hilo después de terminar la tarea: " + Thread.currentThread().isInterrupted());
//		for (int i = 1; i <= 3000; i++) {
//
//			pelota.mueve_pelota(lamina.getBounds());
//
//			lamina.paint(lamina.getGraphics());
//			try {
//				Thread.sleep(4);
//			} catch (InterruptedException e) {
//
//				e.printStackTrace();
//			}
//		}
	}

}
