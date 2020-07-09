package com.cursojava.GUIs.primerFrame;

import java.awt.*;

import javax.swing.*;

public class PrimerJFrame {

	public static void main(String[] args) {
//		JFrame miVentana = new JFrame();
//		miVentana.setSize(600, 350);
//		miVentana.setLocation(600,300);
//		miVentana.getContentPane().setBackground(new Color(51,51,51));
//		
//		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		miVentana.setVisible(true);
		
		Ventana v = new Ventana();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

//	CLASE VENTANA===============================
class Ventana extends JFrame{
		
	public Ventana() {
//		setBounds(600, 350, 450, 450);
//		setResizable(false);
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		setSize(500, 500);
		setLocationRelativeTo(null);
//		getContentPane().setBackground(new Color(51, 51, 51));
		setTitle("Ventana de Prueba");
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image iconImg = tk.getImage("thunder.png");
		setIconImage(iconImg);
		
		
		
//		Último paso, hacer visible la ventana
		setVisible(true);
	}
	
}


