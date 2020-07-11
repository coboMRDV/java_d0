package com.cursojava.GUIs.layout.border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

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
	private static final long serialVersionUID = 1931214376719295062L;

	public Frame() {
		this.setSize(600, 480);
		this.setLocationRelativeTo(null);

//		** MAIN PANEL **	//
		this.add(new Panel());

//		** NORTH **		//
		Panel northPanel = new Panel();
		northPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		northPanel.add(new CButton("Button 1"));
		northPanel.add(new CButton("Button 2"));

//		** CENTER **	//
		Panel centerPanel = new Panel();

//		** SOUTH **		//
		Panel southPanel = new Panel();
		southPanel.setLayout(new BorderLayout(3, 0));

		southPanel.add(new CButton("Button 3"), BorderLayout.WEST);
		southPanel.add(new CButton("Button 4"), BorderLayout.CENTER);
		southPanel.add(new CButton("Button 5"), BorderLayout.EAST);
//		*** ------------------------------***		//

		this.add(northPanel, BorderLayout.NORTH);
		this.add(centerPanel, BorderLayout.CENTER);
		this.add(southPanel, BorderLayout.SOUTH);

		this.setVisible(true);
	}
}

class Panel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7166590698434788366L;

	public Panel() {
		this.setBackground(new Color(55, 55, 55));
		this.setLayout(new BorderLayout(3, 3));

	}
}