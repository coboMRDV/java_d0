package com.cursojava.repaso.cambiarIcono;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CambiaIconoVentana {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {

	public Frame() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setTitle("Ventana de Prueba");
		
		Toolkit toolKit = Toolkit.getDefaultToolkit();
		Image img =  toolKit.getImage("src/img/frappuccino.png");
		this.setIconImage(img);

		this.add(new Panel());
	}

}

class Panel extends JPanel {

	public Panel() {
		this.setBackground(new Color(40, 40, 40));
	}
}