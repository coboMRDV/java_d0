package com.cursojava.repaso.escribirjframe;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EscribeJFrame {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7957761481631285475L;
	public Frame() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		this.add(new Panel());
	}

}

class Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1595281744329945399L;

	public Panel() {
//		this.setBackground(new Color(40, 40, 40));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
				
		g.drawString("Hello World", 250, 200);
	}
}