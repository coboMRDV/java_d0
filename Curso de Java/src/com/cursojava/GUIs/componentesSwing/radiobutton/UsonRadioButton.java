package com.cursojava.GUIs.componentesSwing.radiobutton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class UsonRadioButton {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9049168662943907102L;

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
	private static final long serialVersionUID = 262189379935089301L;
	private JRadioButton r1, r2, r3;

	public Panel() {

		ButtonGroup bGroup = new ButtonGroup();

		r1 = new JRadioButton("Masculino");
		r1.addActionListener(new RadioButtonHandler());
		r2 = new JRadioButton("Femenino");
		r3 = new JRadioButton("Neutro");

		bGroup.add(r1);
		bGroup.add(r2);
		bGroup.add(r3);

		this.add(r1);
		this.add(r2);
		this.add(r3);

	}
	
	private class RadioButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(r1.isSelected()) {
				System.out.println("Has seleccionado masculino");
			}
		}
		
	}
}
