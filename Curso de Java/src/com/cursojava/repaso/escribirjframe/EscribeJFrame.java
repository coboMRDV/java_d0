package com.cursojava.repaso.escribirjframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cobo.mylib.CbConstants;

public class EscribeJFrame {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {
	private Font font = CbConstants.FONT_INPUT;
	public Frame() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		this.add(new Panel());
	}

}

class Panel extends JPanel {

	public Panel() {
//		this.setBackground(new Color(40, 40, 40));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
				
		g.drawString("Hello World", 250, 200);
	}
}