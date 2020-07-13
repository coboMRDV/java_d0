package com.cursojava.repaso.variosoyentes2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariosOyentes {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {

	public Frame() {
		setSize(300, 200);
		setLocationRelativeTo(null);

		add(new Panel());
	}

}

class Panel extends JPanel {

	JButton btnNew, btnCloseAll;

	public Panel() {
		setBackground(new Color(40, 40, 40));

		btnNew = new JButton("New");
		btnCloseAll = new JButton("Close All");
		add(btnNew);
		add(btnCloseAll);

		btnNew.addActionListener(new CreateNewWindow());

	}

	private class CreateNewWindow implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			NewFrame f = new NewFrame(btnCloseAll);
		}

	}

}

class NewFrame extends JFrame {
	
	public static int counter = 0;

	public NewFrame(JButton btnCerrar) {
		setSize(300, 200);
		setTitle("Window " + counter);
		setLocation(100 * counter, 100 * counter);
		setVisible(true);

		counter++;

		btnCerrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}