package com.cursojava.GUIs.componentesSwing.jtextfield;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UsoTextField {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5839291318783646905L;

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
	private static final long serialVersionUID = 4414822366552623999L;

	public Panel() {
		this.setBackground(new Color(55, 55, 55));

		JTextField txt1 = new JTextField(10);
		txt1.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
		JTextField txt2 = new JTextField(10);
		txt2.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));

		JButton btn = new JButton("Aceptar");
		btn.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txt2.setText(txt1.getText());
				txt1.setText("");
			}
		});

		this.add(txt1);
		this.add(btn);
		this.add(txt2);
	}
}