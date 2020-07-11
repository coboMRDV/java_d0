package com.cursojava.GUIs.layout.border2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cobo.mylib.CButton;

public class Border {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7083625945609796337L;

	public Frame() {
		this.setSize(600, 480);
		this.setLocationRelativeTo(null);

		

		this.setVisible(true);
	}
}

class Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5720425875171161844L;

	public Panel() {
		this.setBackground(new Color(55, 55, 55));
		this.setLayout(new BorderLayout(3, 3));
		this.add(new CButton("Amarillo"), BorderLayout.NORTH);
		this.add(new CButton("Rojo"), BorderLayout.WEST);
		this.add(new CButton("Azul"), BorderLayout.CENTER);
		this.add(new CButton("Verde"), BorderLayout.EAST);
		this.add(new CButton("Morado"), BorderLayout.SOUTH);

	}
}