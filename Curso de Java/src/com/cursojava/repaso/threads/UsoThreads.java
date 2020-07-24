package com.cursojava.repaso.threads;

import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class UsoThreads {

	public static void main(String[] args) {
		JFrame marco = new MarcoRebote();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

//Movimiento de la pelota-----------------------------------------------------------------------------------------

class Pelota {

	// Mueve la pelota invirtiendo posición si choca con límites
	// Forma de la pelota en su posición inicial

	private static final int TAMX = 15;
	private static final int TAMY = 15;
	private double x = 0;
	private double y = 0;
	private double dx = 1;
	private double dy = 1;

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

	// Forma de la pelota en su posición inicial

	public Ellipse2D getShape() {

		return new Ellipse2D.Double(x, y, TAMX, TAMY);

	}

}

// Lámina que dibuja las pelotas

class LaminaPelota extends JPanel {

	// Añadimos pelota a la lámina
	// Marco con lámina y botones
	private static final long serialVersionUID = -634758611751713796L;
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

//Marco con lámina y botones

class MarcoRebote extends JFrame {

	private static final long serialVersionUID = -1648655654930896332L;

	// Ponemos botones
	private LaminaPelota lamina;
	private Thread t;

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

class PelotaThreads implements Runnable {

	private Pelota pelota;
	private Component lamina;

	public PelotaThreads(Pelota pelota, Component lamina) {

		this.pelota = pelota;
		this.lamina = lamina;
	}

	@Override
	public void run() {
//		for (int i = 1; i <= 3000; i++) {
		
		while (!Thread.interrupted()) {
//			Thread.sleep(4);
			pelota.mueve_pelota(lamina.getBounds());
			lamina.paint(lamina.getGraphics());
		}
	}

}
