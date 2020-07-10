package com.cursojava.GUIs.eventos.botones;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cobo.mylib.*;

public class EventoSencillo {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5064797555075354708L;

	public Frame() {
		this.setSize(700, 300);
		this.setLocationRelativeTo(null);

		this.add(new Panel());

		this.setVisible(true);
	}
}

class Panel extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2309256516110594356L;
	/**
	 * declara componentes
	 */
	CButton btnRojo = new CButton("Rojo");
	CButton btnVerde = new CButton("Verde");
	CButton btnAzul = new CButton("Azul");
		
	Font font = new Font("InputMono Thin", Font.PLAIN, 18);

	public Panel() {
		/**
		 * aspecto del panel
		 */
		this.setBackground(new Color(40, 40, 40));

		/**
		 * crea eventos
		 */
		btnRojo.addActionListener(this);
		btnRojo.setPadding(10, 40, 10, 40);

		btnVerde.addActionListener(this);
		btnVerde.setPadding(10, 40, 10, 40);

		btnAzul.addActionListener(this);
		btnAzul.setPadding(10, 40, 10, 40);
		
		/**
		 * agrega componentes
		 */
		this.add(btnRojo);
		this.add(btnVerde);
		this.add(btnAzul);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String source = e.getActionCommand();
//		mi solución
		if (source.equals("Rojo")) {
			this.setBackground(new Color(100, 40, 40));
		} else if (source.equals("Verde")) {
			this.setBackground(new Color(40, 100, 40));
		} else {
			this.setBackground(new Color(40, 40, 100));
		}
		
		/**
		 * solución curso
		 */
//		Object origen = e.getSource();
//		if(origen.equals(btnRojo)) {
//			this.setBackground(new Color(100, 40, 40));
//		}else if (source.equals("Verde")) {
//			this.setBackground(new Color(40, 100, 40));
//		} else {
//			this.setBackground(new Color(40, 40, 100));
//		}

	}

}
