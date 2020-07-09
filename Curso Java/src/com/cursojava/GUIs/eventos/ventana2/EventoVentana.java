package com.cursojava.GUIs.eventos.ventana2;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class EventoVentana {

	public static void main(String[] args) {
		new Frame();

	}

}

class Frame extends JFrame {

	public Frame() {
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);

		this.getContentPane().setBackground(new Color(25, 25, 25));

		this.addWindowStateListener(new WindowEvents());

		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
}

class WindowEvents implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {
		System.out.print("La ventana ha cambiado de estado -> ");

		switch (e.getNewState()) {
		case Frame.MAXIMIZED_BOTH:
			System.out.println("Ventana Maximizada");
			break;
		case Frame.ICONIFIED:
			System.out.println("Ventana Minimizada");
			break;
		case Frame.NORMAL:
			System.out.println("Ventana Activada");
			break;

		default:
			break;
		}
	}

}