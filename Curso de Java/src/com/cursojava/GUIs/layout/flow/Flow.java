package com.cursojava.GUIs.layout.flow;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cobo.mylib.*;


public class Flow {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Frame extends JFrame{
	private static final long serialVersionUID = -6058372074157578549L;

	public Frame() {
		this.setSize(500, 300);
		this.setTitle("Panel con Layout");
		this.setLocationRelativeTo(null);
		
		
	
		this.add(new Panel());
		
				
//		** visible **		//
		this.setVisible(true);
	}
}

class Panel extends JPanel{
	private static final long serialVersionUID = 4317173639675331702L;

	public Panel() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 90));
		this.setBackground(new Color(55,55,55));
		this.add(new CButton("Rojo"));
		this.add(new CButton("Verde"));
		this.add(new CButton("Azul"));
	}
	
}