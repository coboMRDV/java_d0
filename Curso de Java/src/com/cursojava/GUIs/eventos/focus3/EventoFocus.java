package com.cursojava.GUIs.eventos.focus3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventoFocus {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5582791869884184032L;

	public Frame() {
		this.setSize(400, 250);
		this.setLocationRelativeTo(null);

		this.add(new Panel());

		this.setVisible(true);
	}

}

class Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6031141620409434801L;
	private JTextField txt1, txt2;

	public Panel() {
		this.setBackground(new Color(50, 50, 50));

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		txt1 = new JTextField();
		txt2 = new JTextField();
		
		txt1.setName("TextField 1");
		txt2.setName("TextField 2");
		
		txt1.setBounds(120, 10, 150, 20);
		txt2.setBounds(120, 50, 150, 20);
					
		txt1.addFocusListener(new ComFocusEvents());
		txt2.addFocusListener(new ComFocusEvents());
		
		add(txt1);
		add(txt2);

	}

}


class ComFocusEvents implements FocusListener{
	
	@Override
	public void focusGained(FocusEvent e) {
		JTextField tf = (JTextField)e.getSource();
		System.out.println("Focus en " + tf.getName());
	}
	
	@Override
	public void focusLost(FocusEvent e) {
		JTextField tf = (JTextField)e.getSource();
		System.out.println(tf.getName() + " pierde el foco.\n");
	}
}

