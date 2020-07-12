package com.cursojava.GUIs.componentesSwing.procesadortexto;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class ProcesadorTexto {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {

	public Frame() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.add(new Panel());

	}

}

class Panel extends JPanel {
	private final JPanel topPanel;
	private final JScrollPane bottomPanel;
	private final JMenuBar menuBar;
	private final JTextPane txtArea;
	private JMenu menuFontFamily;
	private JMenu menuFontStyle;
	private JMenu menuFontSize;

	public Panel() {
		this.setBackground(new Color(55, 55, 55));
		this.setLayout(new BorderLayout());

		/* TOP PANEL */
		menuBar = createMenuBar();
		topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		topPanel.add(menuBar, BorderLayout.WEST);

		/* BOTTOM PANEL */
		txtArea = new JTextPane();
		txtArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		bottomPanel = new JScrollPane(txtArea);
		/*------------------------------------*/

		this.add(topPanel, BorderLayout.NORTH);
		this.add(bottomPanel);
	}

	/**
	 * Crea la barra de menús
	 * 
	 * @return la barra de menús
	 */
	public JMenuBar createMenuBar() {
		JMenuBar bar = new JMenuBar();

		menuFontFamily = new JMenu("Fuente");
		menuFontStyle = new JMenu("Estilo");
		menuFontSize = new JMenu("Tamaño");

		createMenuItem("Courier", "Fuente");
		createMenuItem("Cambria", "Fuente");
		createMenuItem("Corbel", "Fuente");
		createMenuItem("Ink Free", "Fuente");
		createMenuItem("Negrita", "Estilo");
		createMenuItem("Cursiva", "Estilo");
		createMenuItem("14", "Tamaño");
		createMenuItem("16", "Tamaño");
		createMenuItem("18", "Tamaño");
		createMenuItem("24", "Tamaño");
		createMenuItem("26", "Tamaño");
		
		bar.add(menuFontFamily);
		bar.add(menuFontStyle);
		bar.add(menuFontSize);
		
		return bar;
	}

	
	/**
	 * Crea menú item
	 * Recibe dos parámetros, nombreItem, que es el nombre
	 * del item, y nombreMenu, que es el nombre del menú al que 
	 * pertenece
	 * 
	 * el método crea un item con estos dos parámetros y lo
	 * añade al menú correspondiente
	 * 
	 * Finalmenten le añade un listener que ejecuta la opción
	 * que se espera por ese item, usando  StyledSelectorKit
	 * 
	 * 
	 * @param nombreItem el nombre del item de menu
	 * @param nombreMenu el nombre del menú al que se añadirá el item
	 */
	public void createMenuItem(String nombreItem, String nombreMenu) {
	
		JMenuItem item = new JMenuItem(nombreItem);
		
		if(nombreMenu.equals("Fuente")) {
			menuFontFamily.add(item);
			item.addActionListener(new StyledEditorKit.FontFamilyAction( "action", nombreItem));
		}else if(nombreMenu.equals("Estilo")) {
			menuFontStyle.add(item);
			if(nombreItem.equals("Negrita")) {
				item.addActionListener(new StyledEditorKit.BoldAction());
			}else {
				item.addActionListener(new StyledEditorKit.ItalicAction());
			}
		}else if(nombreMenu.equals("Tamaño")) {
			menuFontSize.add(item);
			item.addActionListener(new StyledEditorKit.FontSizeAction("action", Integer.parseInt(nombreItem)));
			
		}
		
	}
}