package com.cursojava.GUIs.fonts;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TipoLetra {

	public static void main(String[] args) {
		Ventana v = new Ventana();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Ventana extends JFrame {

	public Ventana() {
		/**
		 * tamaño y posición
		 */
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);

		/**
		 * añadir componentes
		 */
		this.add(new Panel());

		/**
		 * visibilidad
		 */
		this.setVisible(true);
	}
}

class Panel extends JPanel {

	String[] fuentesDisponibles;
	String fuente;

	public Panel() {
		this.setBackground(new Color(50, 50, 50));
		this.fuentesDisponibles = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		this.fuente = buscarFuente();

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.setFont(new Font(fuente, Font.PLAIN, 40));
		g2.setColor(new Color(125, 125, 125));
		g2.drawString("Hello World!", 20, 50);

	}

	public String buscarFuente() {
		String fuenteBuscada = JOptionPane.showInputDialog("Qué fuente quieres usar?");
		boolean encontrada = false;
		String retVal = "Sans Serif";

		int i = 0;
		while (i < fuentesDisponibles.length && !encontrada) {
			if (fuentesDisponibles[i].equals(fuenteBuscada)) {
				encontrada = true;
				retVal = fuentesDisponibles[i];
			}
			i++;

		}
		
		if(!encontrada) System.out.println("Fuente no encontrada");

		return retVal;
	}
}
