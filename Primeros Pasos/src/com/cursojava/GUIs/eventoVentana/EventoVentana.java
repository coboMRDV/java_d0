package com.cursojava.GUIs.eventoVentana;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventoVentana {

	public static void main(String[] args) {
		new Frame();
		
	}

}

class Frame extends JFrame{
	
	public Frame() {
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		
		this.getContentPane().setBackground(new Color(25, 25, 25));
		
		this.addWindowListener(new WindowEvents());
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
}

class WindowEvents implements WindowListener{

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("Activa");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("Cerrada");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("Cerrando");
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("Desactivada");
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("Restaurada");
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("Minimizada");
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("Abierta");
	}
	
	
}