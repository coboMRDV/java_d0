package com.cursojava.GUIs.disposicionesAvanzadas.spring;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class UsoSpringLayout {

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
	private static final long serialVersionUID = 4298637050702033628L;

	public Frame() {
		this.setSize(400, 280);
		this.setLocationRelativeTo(null);

		this.add(new Panel());

	}

}

class Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7375248210034077593L;
	JButton btn1, btn2, btn3;

	public Panel() {

		this.setBackground(new Color(40, 40, 40));

		btn1 = new JButton("Botón 1");
		btn2 = new JButton("Botón 2");
		btn3 = new JButton("Botón 3");

		/* ================= crear el layout ================ */
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		this.add(btn1);
		this.add(btn2);
		this.add(btn3);

		/* ================= configurar el layout ================ */

		Spring sp = Spring.constant(0, 10, 100);

		/* ================= colocar el layout ================ */

		springLayout.putConstraint(SpringLayout.WEST, btn1, sp, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, btn2, sp, SpringLayout.EAST, btn1);
		springLayout.putConstraint(SpringLayout.WEST, btn3, sp, SpringLayout.EAST, btn2);
		springLayout.putConstraint(SpringLayout.EAST, this, sp, SpringLayout.EAST, btn1);

	}
}
