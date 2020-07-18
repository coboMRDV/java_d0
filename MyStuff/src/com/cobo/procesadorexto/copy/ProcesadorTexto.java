package com.cobo.procesadorexto.copy;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.text.StyledEditorKit;

public class ProcesadorTexto {

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
	private static final long serialVersionUID = 7950258144494728603L;
	private JMenuBar menuBar;
	private JMenu fontFamily, fontStyle, fontSize;
	private JTextPane text;
	private JToolBar toolBar;
	private JMenuItem corbel, cambria, inkFree;
	private JMenuItem bold, italic;
	private JMenuItem size14, size16, size20, size24;
	public Frame() {
		createFrame();

	}

	public void createFrame() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		
		createMenuBar();
		createTextPane();
		createToolBar();

	}

	public void createToolBar() {
		toolBar = new JToolBar();
		toolBar.add(size14);
		toolBar.add(size16);
		toolBar.add(size20);
		toolBar.add(size24);
		
		this.add(toolBar, BorderLayout.WEST);
	}

	public void createMenuBar() {
		menuBar = new JMenuBar();
		add(menuBar, BorderLayout.NORTH);
		fontFamily = new JMenu("Font");
		fontStyle = new JMenu("Style");
		fontSize = new JMenu("Size");
		menuBar.add(fontFamily);
		menuBar.add(fontStyle);
		menuBar.add(fontSize);
		/* ================= font family ================ */
		corbel = new JMenuItem("Corbel");
		cambria = new JMenuItem("Cambria");
		inkFree = new JMenuItem("Ink Free");
		this.createButton(fontFamily, corbel);
		this.createButton(fontFamily, cambria);
		this.createButton(fontFamily, inkFree);
		/* ================= font style ================ */
		bold = new JMenuItem("Bold");
		italic = new JMenuItem("Itlic");
		this.createButton(fontStyle, bold);
		this.createButton(fontStyle, italic);
		/* ================= font size ================ */
		size14 = new JMenuItem("14");
		size16 = new JMenuItem("16");
		size20 = new JMenuItem("20");
		size24 = new JMenuItem("24");
		this.createButton(fontSize, size14);
		this.createButton(fontSize, size16);
		this.createButton(fontSize, size20);
		this.createButton(fontSize, size24);

	}

	public void createTextPane() {
		text = new JTextPane();
		text.setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));
		text.setFont(new Font("Arial", Font.PLAIN, 18));
		text.setText("'I must not fear. Fear is the mind-killer. Fear is the "
				+ "little-death that brings total obliteration. I will face "
				+ "my fear. I will permit it to pass over me and through me. "
				+ "And when it has gone past I will turn the inner eye to see "
				+ "its path. Where the fear has gone there will be nothing. " + "Only I will remain.'\r\n\n"
				+ "― Frank Herbert, Dune");

		JScrollPane bottomPanel = new JScrollPane(text);
		add(bottomPanel, BorderLayout.CENTER);
	}

	public void createButton(JMenu menu, JMenuItem menuItem) {

		if (menu.getText().equals("Font")) {
			menuItem.addActionListener(new StyledEditorKit.FontFamilyAction(menuItem.getText(), menuItem.getText()));
		} else if (menu.getText().equals("Size")) {
			menuItem.addActionListener(
					new StyledEditorKit.FontSizeAction(menuItem.getText(), Integer.parseInt(menuItem.getText())));
		} else {
			if (menuItem.getText().equals("Bold")) {
				menuItem.addActionListener(new StyledEditorKit.BoldAction());
			} else {
				menuItem.addActionListener(new StyledEditorKit.ItalicAction());
			}
		}
		menu.add(menuItem);
	}
}