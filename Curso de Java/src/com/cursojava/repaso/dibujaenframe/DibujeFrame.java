package com.cursojava.repaso.dibujaenframe;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DibujeFrame {

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
	private static final long serialVersionUID = 8341481289162853198L;

	public Frame() {
		this.setSize(650, 450);
		this.setLocationRelativeTo(null);

		this.add(new Panel());
	}

}

class Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4494666674009397597L;

	public Panel() {
		this.setBackground(new Color(80, 80, 80));
	}
	
	public void paintComponent(Graphics g ) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(new Color(100, 40, 40));
		g2d.draw3DRect(170, 50,  200, 200, true);
		
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(new Color(40, 100, 40));
		g2d.fill3DRect(220, 100,  200, 200, true);
	
		
		g2d.setStroke(new BasicStroke(8));
		g2d.setColor(new Color(40, 40, 100));
		g2d.draw3DRect(270, 150,  200, 200, true);
		
		
		
		
	}
}