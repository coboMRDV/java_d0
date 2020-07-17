package com.cobo.procesadorexto;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.BoldAction;

public class ProcesadorTexto {
	/*
	 * necesito una barra de herramientas arriba con los menús a a la izquierda
	 * topPanel - borderlayout 
	 * 
	 * necesito un panel abajo con el textpane ocupando la parte central 
	 * bottom panel - borderlayout
	 * 
	 * quiero poner una barra de herramientas, con posición inicial en el panel
	 * de abajo a la izquierda
	 * 
	 * frame
	 * 	panel
	 * 		topPanel [barra de menús]
	 * 		bottompanel [textpane]
	 *
	 * 
	 * Menu font corbel, cambria, inkFree;
	 * Size 16, 18, 24, 28
	 * 
	 * Style bold, italics
	 * 
	 * Colors
	 * Alignment
	 * 
	 */
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}


class Frame extends JFrame{
		
		private JPanel bottomPanel;
		private JMenuBar menuBar;
		private JMenu font, style, size;
		private JMenuItem corbel, cambria, inkFree;
		private JMenuItem bold, italic;
		private JMenuItem size16, size18, size24, size28;
		private JScrollPane scrollPane;
		private JTextPane text;
		private JToolBar toolBar;
		
		public Frame() {
			createFrame();
		}

		private void createFrame() {
			setSize(800, 600);
			setLocationRelativeTo(null);
			setLayout(new BorderLayout());
			createMenuBar();
			createBottomPanel();
			createToolBar();
		}


		public void createMenuBar() {
			menuBar = new JMenuBar();
			
			font = new JMenu("Font");
			style = new JMenu("Style");
			size = new JMenu("Size");
			
			menuBar.add(font);
			menuBar.add(style);
			menuBar.add(size);
			
			/* ================= menu fonts ================ */
			corbel = new JMenuItem("Corbel");
			cambria = new JMenuItem("Cambria");
			inkFree = new JMenuItem("Ink Free");
			font.add(corbel);
			font.add(cambria);
			font.add(inkFree);
				/* ================= adding actions ================ */
				corbel.addActionListener(new StyledEditorKit.FontFamilyAction("action", "Corbel"));
				cambria.addActionListener(new StyledEditorKit.FontFamilyAction("action", "Cambria"));
				inkFree.addActionListener(new StyledEditorKit.FontFamilyAction("action", "Ink Free"));
			/* ================= menu style ================ */
			bold = new JMenuItem("Bold Ctrl + B");
			italic = new JMenuItem("Italic Ctrl + I");
			style.add(bold);
			style.add(italic);
				/* ================= adding actions ================ */
				bold.addActionListener(new StyledEditorKit.BoldAction());
				italic.addActionListener(new StyledEditorKit.ItalicAction());
			/* ================= menu size ================ */
			size16 = new JMenuItem("16");
			size18 = new JMenuItem("18");
			size24 = new JMenuItem("24");
			size28 = new JMenuItem("28");
			size.add(size16);
			size.add(size18);
			size.add(size24);
			size.add(size28);
			/* ================= adding actions ================ */
			size16.addActionListener(new StyledEditorKit.FontSizeAction("action", 16));
			size18.addActionListener(new StyledEditorKit.FontSizeAction("action", 18));
			size24.addActionListener(new StyledEditorKit.FontSizeAction("action", 24));
			size28.addActionListener(new StyledEditorKit.FontSizeAction("action", 28));
			
			add(menuBar, BorderLayout.NORTH);
		}
		
		public void createBottomPanel(){
			bottomPanel = new JPanel();
			bottomPanel.setLayout(new BorderLayout());
			createTextPane();
			
			add(bottomPanel, BorderLayout.CENTER);
			
		}
		
		public void createTextPane() {
			text = new JTextPane();
			text.setFont(new Font("Arial", Font.PLAIN, 16));
			text.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
			text.setText(
					"I must not fear. Fear is the mind-killer. Fear is the little-death that brings total obliteration.\r\n" + 
					"I will face my fear. I will permit it to pass over me and through me.\r\n" + 
					"And when it has gone past I will turn the inner eye to see its path.\r\n" + 
					"Where the fear has gone there will be nothing. Only I will remain.");
			
			
			scrollPane = new JScrollPane(text);
			bottomPanel.add(scrollPane, BorderLayout.CENTER);
		}
		
		public void createToolBar() {
			JToolBar toolBar = new JToolBar("Color", JToolBar.VERTICAL);
			toolBar.setAlignmentX(JToolBar.LEFT_ALIGNMENT);
					
			/* ================= color buttons ================ */
			JMenuItem tbRed = new JMenuItem(new ImageIcon("src/redIcon.png"));
			JMenuItem tbGreen = new JMenuItem(new ImageIcon("src/greenIcon.png"));
			JMenuItem tbBlue = new JMenuItem(new ImageIcon("src/blueIcon.png"));

			tbRed.addActionListener(new StyledEditorKit.ForegroundAction("redAction", new Color(100, 40, 40)));
			tbGreen.addActionListener(new StyledEditorKit.ForegroundAction("greenAction", new Color(40, 100, 40)));
			tbBlue.addActionListener(new StyledEditorKit.ForegroundAction("blueAction", new Color(04, 40, 100)));
			toolBar.add(tbRed);
			toolBar.add(tbGreen);
			toolBar.add(tbBlue);
			toolBar.addSeparator();
			/* ================= style buttons ================ */
			JMenuItem tbBold = new JMenuItem(new ImageIcon("src/bold.png"));
			JMenuItem tbItalic = new JMenuItem(new ImageIcon("src/italic.png"));
			tbBold.addActionListener(new StyledEditorKit.BoldAction());
			tbItalic.addActionListener(new StyledEditorKit.ItalicAction());
			toolBar.add(tbBold);
			toolBar.add(tbItalic);

			toolBar.addSeparator();
			/* ================= alignement buttons ================ */
			JMenuItem tbLeft= new JMenuItem(new ImageIcon("src/left.png"));
			JMenuItem tbCenter= new JMenuItem(new ImageIcon("src/center.png"));
			JMenuItem tbRight= new JMenuItem(new ImageIcon("src/right.png"));
			tbLeft.addActionListener(new StyledEditorKit.AlignmentAction("left", SwingConstants.CENTER));
			tbCenter.addActionListener(new StyledEditorKit.AlignmentAction("center", SwingConstants.RIGHT));
			tbRight.addActionListener(new StyledEditorKit.AlignmentAction("right", SwingConstants.LEFT));
			toolBar.add(tbLeft);
			toolBar.add(tbCenter);
			toolBar.add(tbRight);
		
			/* ================= including shortcuts ================ */
			InputMap inputMap = bottomPanel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
			ActionMap actionMap = bottomPanel.getActionMap();
			
			inputMap.put(KeyStroke.getKeyStroke("ctrl B"), "bold");
			inputMap.put(KeyStroke.getKeyStroke("ctrl I"), "italic");
			actionMap.put("bold", new StyledEditorKit.BoldAction());
			actionMap.put("italic", new StyledEditorKit.ItalicAction());

			
			
			bottomPanel.add(toolBar, BorderLayout.WEST);
			toolBar.setAlignmentX(SwingConstants.LEFT);
			
		}
		
		
}
