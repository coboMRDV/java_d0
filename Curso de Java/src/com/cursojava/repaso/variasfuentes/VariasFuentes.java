package com.cursojava.repaso.variasfuentes;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.*;

import com.cobo.mylib.CbFunctions;

public class VariasFuentes {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {

	private static final long serialVersionUID = -80994546818843578L;

	public Frame() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		this.add(new Panel());
	}

}

class Panel extends JPanel {

	private static final long serialVersionUID = -3263308433839388810L;

	public Panel() {
		this.setBackground(new Color(40, 40, 40));

		ColorActionHandler accionAzul = new ColorActionHandler("Azul", new Color(40, 40, 100));
		ColorActionHandler accionRojo = new ColorActionHandler("Rojo", new Color(100, 40, 40));
		ColorActionHandler accionVerde = new ColorActionHandler("Verde", new Color(40, 100, 40));

		/** botones creados con actions **/
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		add(new JButton(accionVerde));
		
		/* CREAR EL INPUT MAP Y EL ACTIONMAP*/
//		InputMap inputMap = this.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		InputMap inputMap = CbFunctions.getInputMap(this);
		ActionMap actionMap = this.getActionMap();
					
		/* INCLUIR LOS KEYSTROKES EN EL INPUTMAP*/
		inputMap.put(KeyStroke.getKeyStroke("ctrl A"), "bgAzul");//keystroke , actionMapKey
		inputMap.put(KeyStroke.getKeyStroke("ctrl R"), "bgRojo");//keystroke , actionMapKey
		inputMap.put(KeyStroke.getKeyStroke("ctrl V"), "bgVerde");//keystroke , actionMapKey
		
		/* INCLUIR LA ACCIÓN EN EL ACTIONMAP (usando la key de la acción)*/
		actionMap.put("bgAzul", accionAzul);
		actionMap.put("bgRojo", accionRojo);
		actionMap.put("bgVerde", accionVerde);
	}

	/**
	 * Maneja las acciones de los botones
	 * y los atajos de teclado que cambian
	 * el color de fondo de la ventana
	 * 
	 * @author Cobo
	 *
	 */
	private class ColorActionHandler extends AbstractAction {

		private static final long serialVersionUID = 2466666607877684343L;
		/**
		 * Constructor de la clase ColorActionHandler
		 * Estos parámetros son pasados por el interés del
		 * ejercicio, realmenten sólo el color es realmente necesario aquí
		 * 
		 * @param nombreBoton el nombre del botón
		 * @param color el color para el background
		 */
		public ColorActionHandler(String nombreBoton, Color color) {
			this.putValue(AbstractAction.NAME, nombreBoton);
			this.putValue("JPanelBgColor", color);
			this.putValue(AbstractAction.SHORT_DESCRIPTION, "Pone el panel de color " + nombreBoton);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color) this.getValue("JPanelBgColor");
			setBackground(c);
			System.out.println(
					String.format(
							"%-7s  %s", 
				getValue(AbstractAction.NAME), getValue(AbstractAction.SHORT_DESCRIPTION)));
		}

	}
}
