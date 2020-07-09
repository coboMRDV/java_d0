package com.cursojava.GUIs.eventos.multiplesFuentes3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class VariasFuentes {
	/**
	 * Crear una lámina con 3 botones. | Rojo | Verde | Azul
	 * 
	 * Al pulsar un botón, el color de fondo de la lámina se pondrá de ese color
	 */

	public static void main(String[] args) {

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
		
		ButtonEvents cRojo = new ButtonEvents("Rojo", new Color(100, 40, 40));
		ButtonEvents cVerde= new ButtonEvents("Verde", new Color(40, 100, 40));
		ButtonEvents cAzul = new ButtonEvents("Azul", new Color(40, 40, 100));
		
		JButton btnRojo = new JButton(cRojo);
		JButton btnVerde= new JButton(cVerde);
		JButton btnAzul = new JButton(cAzul);
		
		this.add(btnRojo);
		this.add(btnVerde);
		this.add(btnAzul);

	}

	class ButtonEvents extends AbstractAction {

		public ButtonEvents(String nombre, Color bgColor) {
			putValue(Action.NAME, nombre);
			putValue(Action.SHORT_DESCRIPTION, "Cambia el color del panel a " + nombre);
			putValue("bgColor", bgColor);
		}

		/**
		 * 
		 */
		private static final long serialVersionUID = 4733914784665664200L;

		@Override
		public void actionPerformed(ActionEvent e) {
			Color color = (Color) getValue("bgColor");
			setBackground(color);
			System.out.println("Botón " + getValue(Action.NAME) + "\t| " + getValue(Action.SHORT_DESCRIPTION));

		}

	}
}
