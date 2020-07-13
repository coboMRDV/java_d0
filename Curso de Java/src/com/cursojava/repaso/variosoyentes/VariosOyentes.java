package com.cursojava.repaso.variosoyentes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.FontSizeAction;



public class VariosOyentes {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {

	public Frame() {
		this.setBounds(1300, 100, 400, 300);

		this.add(new Panel());
	}

}

class Panel extends JPanel {
	private JButton btnNuevo, btnCerrar;

	public Panel() {
		this.setBackground(new Color(40, 40, 40));
		btnNuevo = new JButton("Nuevo");
		btnCerrar = new JButton("Cerrar Todo");

		add(btnNuevo);
		add(btnCerrar);

		btnNuevo.addActionListener(new ButtonHandler());
	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			NewFrame f = new NewFrame(btnCerrar);
		}
		
	}
}

class NewFrame extends JFrame {

	private static int contador = 0;

	public NewFrame(JButton btnCerrar) {
		contador ++;
		this.setTitle("Ventana " + contador);
		this.setBounds(50 * contador, 50 * contador, 300, 200);

		this.setVisible(true);
		
		btnCerrar.addActionListener(new CierraVentanas());

	}
	
	private class CierraVentanas implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
		
	}
}