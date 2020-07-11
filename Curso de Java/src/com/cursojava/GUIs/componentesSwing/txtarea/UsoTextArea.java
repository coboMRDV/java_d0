package com.cursojava.GUIs.componentesSwing.txtarea;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.cobo.mylib.CButton;

public class UsoTextArea {

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
	private static final long serialVersionUID = 1L;

	public Frame() {
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);

		this.add(new Panel());

	}

}

class Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea txtArea = new JTextArea(7, 48);
	
	public Panel() {
		this.setBackground(new Color(55, 55, 55));
		
		JScrollPane jsPane = new JScrollPane(txtArea);
		txtArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txtArea.setLineWrap(true);
		
		CButton btn = new CButton("Print");
		btn.addActionListener(new ButtonEventHandler());
		
		this.add(jsPane);
		this.add(btn);
			
		
	}
	class ButtonEventHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println(txtArea.getText());
		}
		
	}
}


