package com.cursojava.GUIs.componentesSwing.barraherramientas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

public class VariasFuentes {

	public static void main(String[] args) {

		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}

}

class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4205317210078043212L;
	JPanel panel;
	JToolBar toolBar;

	public Frame() {
		this.setSize(480, 320);
		this.setLocationRelativeTo(null);

		panel = new JPanel();

		abstractAction actionRojo = new abstractAction("Rojo", new Color(100, 40, 40),
				new ImageIcon("src/img/icons/redIcon.png"));
		abstractAction actionVerde = new abstractAction("Verde", new Color(40, 100, 40),
				new ImageIcon("src/img/icons/greenIcon.png"));
		abstractAction actionAzul = new abstractAction("Azul", new Color(40, 40, 100),
				new ImageIcon("src/img/icons/blueIcon.png"));


		toolBar = new JToolBar();
		toolBar.add(actionRojo);
		toolBar.add(actionVerde);
		toolBar.add(actionAzul);
		
		JPopupMenu popupMenu = new JPopupMenu();
		JMenuItem r = new JMenuItem(actionRojo);
		JMenuItem v = new JMenuItem(actionVerde);
		JMenuItem a = new JMenuItem(actionAzul);
		
		popupMenu.add(r);
		popupMenu.add(v);
		popupMenu.addSeparator();
		popupMenu.add(a);
		
		panel.setComponentPopupMenu(popupMenu);
		
		this.add(toolBar, BorderLayout.NORTH);
		this.add(panel);

	}

	class abstractAction extends AbstractAction {

		public abstractAction(String nombre, Color bgColor, Icon icon) {
			putValue(Action.NAME, nombre);
			putValue(Action.SMALL_ICON, icon);
			putValue(Action.SHORT_DESCRIPTION, "Cambia el color del panel a " + nombre);
			putValue("bgColor", bgColor);
		}

		private static final long serialVersionUID = 4733914784665664200L;

		@Override
		public void actionPerformed(ActionEvent e) {
			Color color = (Color) getValue("bgColor");
			panel.setBackground(color);
			System.out.println("Botón " + getValue(Action.NAME) + " " + getValue(Action.SHORT_DESCRIPTION));

		}

	}

}
