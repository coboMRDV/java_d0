package com.cursojava.GUIs.componentesSwing.jslider;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class UsoJSlider {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {

	public Frame() {
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);

		this.add(new Panel());
	}

}

class Panel extends JPanel {
	private  JSlider jSlider;
	
	public Panel() {
		this.setBackground(new Color(55, 55, 55));
		JSlider jSlider = new JSlider();
		
		this.add(jSlider);
	}
}
