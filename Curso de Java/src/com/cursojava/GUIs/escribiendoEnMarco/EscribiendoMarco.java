package com.cursojava.GUIs.escribiendoEnMarco;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;

public class EscribiendoMarco {

	public static void main(String[] args) {
		Frame v = new Frame();

		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7678707132185011764L;

	public Frame() {
		setSize(500, 350);
		setLocationRelativeTo(null);
		setTitle("Escritura en JFrame");
		
		add(new Panel());
		
//		**** visible ***		//
		setVisible(true);
	}
}

class Panel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6422156430693480925L;

	public Panel() {
		setBackground(new Color(51, 51, 51));
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
					
		g.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 40));
		g.setColor(new Color(148, 145, 145));
		g.drawString("Hello World", 100, 100);
		
		
	}

}
