package com.cursojava.GUIs.componentesSwing.barraherramientas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


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
		
		abstractAction actionRojo = new abstractAction("Rojo", new Color(100, 40, 40));
		abstractAction actionVerde= new abstractAction("Verde", new Color(40, 100, 40));
		abstractAction actionAzul = new abstractAction("Azul", new Color(40, 40, 100));
		
		JButton btnRojo = new JButton(actionRojo);
		JButton btnVerde= new JButton(actionVerde);
		JButton btnAzul = new JButton(actionAzul);
		
		this.add(btnRojo);
		this.add(btnVerde);
		this.add(btnAzul);
			
		/**
		 * CREACIÓN SHORTCUTS
		 */
		InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		ActionMap actionMap = getActionMap();
				
		/** ROJO **/
		inputMap.put(KeyStroke.getKeyStroke("ctrl R"), "Fondo Rojo");
		actionMap.put("Fondo Rojo", actionRojo);
		
		/** AZUL **/
		inputMap.put(KeyStroke.getKeyStroke("ctrl A"), "Fondo Azul");
		inputMap.put(KeyStroke.getKeyStroke("ctrl D"), "Fondo Azul");
		actionMap.put("Fondo Azul", actionAzul);
			
		
		/** VERDE **/
		inputMap.put(KeyStroke.getKeyStroke("ctrl V"), "Fondo Verde");
		actionMap.put("Fondo Verde", actionVerde);
		
		
	}

	class abstractAction extends AbstractAction {

		public abstractAction(String nombre, Color bgColor) {
			this.putValue(Action.NAME, nombre);
			this.putValue(Action.SHORT_DESCRIPTION, "Cambia el color del panel a " + nombre);
			this.putValue("bgColor", bgColor);
		}

		/**
		 * 
		 */
		private static final long serialVersionUID = 4733914784665664200L;

		@Override
		public void actionPerformed(ActionEvent e) {
			Color color = (Color) getValue("bgColor");
			setBackground(color);
			System.out.println("Botón " + getValue(Action.NAME) + " " + getValue(Action.SHORT_DESCRIPTION));

		}

	}
}
