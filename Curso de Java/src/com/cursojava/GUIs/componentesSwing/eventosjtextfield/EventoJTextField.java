package com.cursojava.GUIs.componentesSwing.eventosjtextfield;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventoJTextField {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Frame() {
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);

		this.add(new Panel());

		this.setVisible(true);
	}

}

class Panel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txt1 = new JTextField(20);
	
	public Panel() {
		this.setBackground(new Color(55, 55, 55));
		txt1.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
		txt1.setFont(new Font("InputMono Thin", Font.PLAIN, 16));
		Document doc =  txt1.getDocument();
		doc.addDocumentListener(new DocumentEventHandler());				
		this.add(txt1);

	}

	class DocumentEventHandler implements DocumentListener {

		@Override
		public void changedUpdate(DocumentEvent arg0) {
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			System.out.println("Has introducido texto");
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			System.out.println("Has borrado texto");
		}

	}
}
