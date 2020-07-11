package com.cursojava.GUIs.componentesSwing.jcmBox2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.cobo.mylib.CbConstants;
import com.cobo.mylib.CbFunctions;

public class UsoJComboBox {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {

	private static final long serialVersionUID = 5040770195384460801L;

	public Frame() {
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);

		this.add(new Panel());
	}

}

class Panel extends JPanel {

	private static final long serialVersionUID = 597598393742426778L;
//	String availableFonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	String availableFonts[];
	JComboBox<String> cmb;
	JTextArea txtArea;
	JPanel topPanel;
	JScrollPane centerPanel;

	public Panel() {
//		this.setBackground(new Color(55, 55, 55));
		this.setLayout(new BorderLayout());

//		Top
		topPanel = new JPanel();
		cmb = new JComboBox<String>();
		availableFonts = CbFunctions.getAvailableFonts();
		for (String font : availableFonts) {
			cmb.addItem(font);
		}
		cmb.addActionListener(new ComboBoxEventHandler());
		topPanel.add(cmb);

//		CenterPanel
		txtArea = new JTextArea();
		centerPanel = new JScrollPane(txtArea);
		txtArea.setBorder(BorderFactory.createEmptyBorder(24, 24, 24, 24));
		txtArea.setFont(CbConstants.FONT_SANS);
		txtArea.setBackground(new Color(220,220,220 ));
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true);

//		Añado texto para no copiar y pegar mientras hago pruebas
		txtArea.setText(
			"El miedo mata la mente. El miedo es la pequeña muerte "
			+ "que conduce a la destrucción total. Afrontaré mi miedo. "
			+ "Permitiré que pase sobre mi y a través de mi. Y cuando haya "
			+ "pasado giraré mi ojo interior para escrutar su camino. Allá "
			+ "donde haya pasado el miedo ya no habrá nada, solo estaré yo.");

		
		
		this.add(topPanel, BorderLayout.NORTH);
		this.add(centerPanel, BorderLayout.CENTER);
	}

	private class ComboBoxEventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			@SuppressWarnings("unchecked")
			JComboBox<String> combo = (JComboBox<String>) e.getSource();
			String fontName = (String) combo.getSelectedItem();

			txtArea.setFont(new Font(fontName, Font.PLAIN, 16));
		}

	}
}