package com.cursojava.GUIs.componentesSwing.menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class UsoMenu {

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
	private static final long serialVersionUID = 9026930781287222544L;

	public Frame() {
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);

		this.add(new Panel());
	}

}

class Panel extends JPanel  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 867280745153697519L;
	JMenuBar menuBar;

	public Panel() {
		this.setBackground(new Color(55, 55, 55));
		this.setLayout(new BorderLayout());
		
		
//		===========  MENU ============	//
		menuBar = new JMenuBar();
		/*
		 * menu archivo
		 */
		JMenu menuArchivo = new JMenu("Archivo");
		JMenuItem itemGuardar = new JMenuItem("Guardar");
		JMenuItem itemGuardarComo = new JMenuItem("Guardar como...");
		menuArchivo.add(itemGuardar);
		menuArchivo.add(itemGuardarComo);
//		**acciones**
		itemGuardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Guardar");
			}
		});

		/*
		 * menu edición
		 */
		JMenu menuEdicion = new JMenu("Edición");
		JMenuItem itemCortar = new JMenuItem("Cortar");
		JMenuItem itemCopiar = new JMenuItem("Copiar");
		JMenuItem itemPegar = new JMenuItem("Pegar");
		menuEdicion.add(itemCortar);
		menuEdicion.add(itemCopiar);
		menuEdicion.add(itemPegar);

		/*
		 * menu herramientas
		 */
		JMenu menuHerramientas = new JMenu("Herramientas");
		JMenuItem itemOpciones = new JMenuItem("Opciones");
		JMenu submenuPreferencias = new JMenu("Preferencias");
		menuHerramientas.add(itemOpciones);
		menuHerramientas.addSeparator();
		menuHerramientas.add(submenuPreferencias);

		JMenuItem itemGenerales = new JMenuItem("Generales");
		JMenuItem itemAyuda = new JMenuItem("Ayuda");
		submenuPreferencias.add(itemGenerales);
		submenuPreferencias.add(itemAyuda);
//		=========== FINAL DEL MENU ============	//

		menuBar.add(menuArchivo);
		menuBar.add(menuEdicion);
		menuBar.add(menuHerramientas);

		this.add(menuBar, BorderLayout.NORTH);

	}
}