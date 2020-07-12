package com.cursojava.GUIs.componentesSwing.procesadortextos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.Document;
import javax.swing.text.StyledEditorKit;


import com.cobo.mylib.CbFunctions;

public class ProcesadorTextos {

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

	private final JMenuBar menuBar;
	private final JTextArea txtArea;
	private final JPanel topPanel;
	private final JScrollPane bottomPanel;
	private String fontFamily = "Rubik";
	private int fontStyle = Font.PLAIN;
	private int fontSize = 16;
	private Font font;
	private boolean esNegrita = false;
	private boolean esCursiva = false;
	

	public Panel() {
		this.setBackground(new Color(55, 55, 55));
		this.setLayout(new BorderLayout());
		this.font = new Font(fontFamily, fontStyle, fontSize);

		menuBar = this.createMenuBar();

		topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout());
		topPanel.add(menuBar, BorderLayout.WEST);

		txtArea = new JTextArea();
		txtArea.setFont(font);
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true);
		txtArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		txtArea.setText("'I must not fear. Fear is the mind-killer. Fear is the "
				+ "little-death that brings total obliteration. I will face my "
				+ "fear. I will permit it to pass over me and through me. "
				+ "And when it has gone past I will turn the inner eye to see "
				+ "its path. Where the fear has gone there will be nothing. "
				+ "Only I will remain.'\r\n"
				+ "― Frank Herbert, Dune");

		bottomPanel = new JScrollPane(txtArea);

		this.add(topPanel, BorderLayout.NORTH);
		this.add(bottomPanel, BorderLayout.CENTER);
	}

	/**
	 * Crea una barra de menús y sus menus
	 * 
	 * @return la barra de menús de la app
	 */
	private JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu font, style, size;
		JMenuItem Courier, cambria, corbel, inkFree, negrita, cursiva, size12, size14, size16, size24, size28;

		/** MENU BAR **/
		/** fuente | estilo | tamaño **/
		font = new JMenu("Fuente");
		style = new JMenu("Estilo");
		size = new JMenu("Tamaño");
		menuBar.add(font);
		menuBar.add(style);
		menuBar.add(size);
		/* Menu fuente */
		Courier = new JMenuItem("Courier");
		cambria = new JMenuItem("Cambria");
		corbel = new JMenuItem("Corbel");
		inkFree = new JMenuItem("Ink Free");
		font.add(Courier);
		font.add(cambria);
		font.add(corbel);
		font.add(inkFree);
		Courier.addActionListener(new MenuItemsEventHandler());
		cambria.addActionListener(new MenuItemsEventHandler());
		corbel.addActionListener(new MenuItemsEventHandler());
		inkFree.addActionListener(new MenuItemsEventHandler());
		/** Menu Estilo **/
		negrita = new JMenuItem("Negrita");
		cursiva = new JMenuItem("Cursiva");
		style.add(negrita);
		style.add(cursiva);
		negrita.addActionListener(new MenuItemsEventHandler());
		cursiva.addActionListener(new MenuItemsEventHandler());
		/** Menu tamaño **/
		size12 = new JMenuItem("12");
		size14 = new JMenuItem("14");
		size16 = new JMenuItem("16");
		size24 = new JMenuItem("24");
		size28 = new JMenuItem("28");
		size.add(size12);
		size.add(size14);
		size.add(size16);
		size.add(size24);
		size.add(size28);
		size12.addActionListener(new MenuItemsEventHandler());
		size14.addActionListener(new MenuItemsEventHandler());
		size16.addActionListener(new MenuItemsEventHandler());
		size24.addActionListener(new MenuItemsEventHandler());
		size28.addActionListener(new MenuItemsEventHandler());
		
		return menuBar;
	}
	
	
	/*
	 * Recarga la fuente con los cambios hechos
	 * 
	 */
	public void reloadFont() {
		txtArea.setFont(new Font(fontFamily, fontStyle, fontSize));
		
	}

	
	/**
	 * gestiona los eventos de la barra de menús
	 * 
	 * @author Cobo
	 *
	 */
	private class MenuItemsEventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JMenuItem item = (JMenuItem)e.getSource();
			
			if(item.getText().equals("Courier")) {
				fontFamily = "Courier";
			}else if(item.getText().equals("Cambria")) {
				fontFamily = "Cambria";
			}else if(item.getText().equals("Corbel")) {
				fontFamily = "Corbel";
			}else if(item.getText().equals("Ink Free")) {
				fontFamily = "Ink Free";
			}else if(item.getText().equals("12")) {
				fontSize = 12;
			}else if(item.getText().equals("14")) {
				fontSize = 14;
			}else if(item.getText().equals("16")) {
				fontSize = 16;
			}else if(item.getText().equals("24")) {
				fontSize = 24;
			}else if(item.getText().equals("28")) {
				fontSize = 28;
			}else if(item.getText().equals("Negrita")) {
				if(!esNegrita) {
					fontStyle += font.BOLD;
					
				}else {
					fontStyle -= font.BOLD;
				}
				esNegrita = !esNegrita;
			}else if(item.getText().equals("Cursiva")) {
				if(!esCursiva) {
					fontStyle += font.ITALIC;
					
				}else {
					fontStyle -= font.ITALIC;
				}
				esCursiva = !esCursiva;
			}
			
			
			reloadFont();
			
					
		}
		
	}
	
}