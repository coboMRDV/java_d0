package com.cursojava.GUIs.eventos.multiplesFuentes2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import com.cobo.mylib.CButton;

public class VariasFuentes {

	public static void main(String[] args) {
		/**
		 * Crear una lámina con 3 botones. | Rojo | Verde | Azul
		 * 
		 * Al pulsar un botón, el color de fondo de la lámina se pondrá de ese color
		 */

		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2772274806145005154L;

	public Frame() {
		this.setSize(480, 320);
		this.setLocationRelativeTo(null);

		this.add(new Panel());

		this.setVisible(true);
	}
}

class Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8850065370524263490L;
	
	public Panel() {
		this.setBackground(new Color(50, 50, 50));
		
		CButton btnRojo = new CButton("Rojo");
		CButton btnVerde = new CButton("Verde");
		CButton btnAzul = new CButton("Azul");

		btnRojo.addActionListener(new ButtonEvents());
		btnVerde.addActionListener(new ButtonEvents());
		btnAzul.addActionListener(new ButtonEvents());

		this.add(btnRojo);
		this.add(btnVerde);
		this.add(btnAzul);

	}

	class ButtonEvents implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			CButton b = (CButton) e.getSource();

			switch (b.getText()) {
			case "Rojo":
				setBackground(new Color(100, 40, 40));
				break;
			case "Verde":
				setBackground(new Color(40, 100, 40));
				break;
			case "Azul":
				setBackground(new Color(40, 40, 100));
				break;

			default:
				break;
			}

		}

	}
}
