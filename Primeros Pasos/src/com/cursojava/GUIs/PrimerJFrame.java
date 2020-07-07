package com.cursojava.GUIs;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class PrimerJFrame {

	public static void main(String[] args) {
		JFrame miVentana = new JFrame();
		miVentana.setSize(600, 500);
		miVentana.setLocation(600,400);
		System.out.println(miVentana.getContentPane());
		miVentana.getContentPane().setBackground(new Color(51,51,51));
		System.out.println(miVentana.getContentPane());
		
		miVentana.setVisible(true);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
