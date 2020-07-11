package com.cursojava.GUIs.layout.calculadora2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.cobo.mylib.CButton;

/*
 * Hay que crear una calculadora
 * Tendrá que mostar un panel superior (donde habrá que escribir)
 * Y uno inferior con los números
 * 
 * Estará compuesto por:
 * - 1 Frame principal
 * - 2 Panele interiores | El display y el teclado numérico
 *  
 * El frame principal será un border layout
 * - north para el display | esto será un borderlayout con TextField en center
 * - center para las teclas | esto un gridlayout de 4 x 5
 *   
 */

public class Calculadora {
	
	public static void main(String[] args) {
		FrameCalculadora f = new FrameCalculadora();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}

class FrameCalculadora extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6972573558782855991L;

	public FrameCalculadora() {
		this.setSize(300, 350);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(55,55,55));
		
			
		this.setLayout(new BorderLayout(3, 3));
		
		this.add(new PanelSuperior(), BorderLayout.NORTH);
		this.add(new PanelNumeros(), BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}

class PanelSuperior extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5526145040605614370L;
	JTextField txtPanel = new JTextField();
	
	public PanelSuperior() {
		this.setBackground(new Color(55,55,55));
		this.setLayout(new BorderLayout(3, 3));
		
		txtPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
		txtPanel.setText("0");
		txtPanel.setFont(new Font("InputMono", Font.PLAIN, 20));
		txtPanel.setHorizontalAlignment(SwingConstants.RIGHT);
	
		
		this.add(txtPanel, BorderLayout.NORTH);
	}
}

class PanelNumeros extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5459612803572944220L;

	public PanelNumeros() {
		this.setBackground(new Color(55,55,55));
		this.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		this.setLayout(new GridLayout(4, 5, 5, 5));
		
		this.add(new CButton("7"));
		this.add(new CButton("8"));
		this.add(new CButton("9"));
		this.add(new CButton("/"));
		
		this.add(new CButton("4"));
		this.add(new CButton("5"));
		this.add(new CButton("6"));
		this.add(new CButton("x"));
		
		this.add(new CButton("1"));
		this.add(new CButton("2"));
		this.add(new CButton("3"));
		this.add(new CButton("-"));
		
		this.add(new CButton("0"));
		this.add(new CButton("."));
		this.add(new CButton("="));
		this.add(new CButton("+"));
	}
}