package com.cursojava.repaso.eventosboton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosBotones {
	public static void main(String[]args) {
		
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}


class Frame extends JFrame{
	public Frame() {
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		
		this.add(new Panel());
	}
}

class Panel extends JPanel{
	
	private final JButton btnRed, btnGreen, btnBlue;
	
	public Panel() {
		this.setBackground(new Color(40, 40, 40));
		
		btnRed = new JButton("Red");
		btnGreen = new JButton("Green");
		btnBlue = new JButton("Blue");
		
		btnRed.addActionListener(new ChangeBgColor(new Color(100, 40, 40)));
		btnGreen.addActionListener(new ChangeBgColor(new Color(40, 100, 40)));
		btnBlue.addActionListener(new ChangeBgColor(new Color(40, 40, 100)));
		
		this.add(btnRed);
		this.add(btnGreen);
		this.add(btnBlue);
	}
	
	private class ChangeBgColor implements ActionListener{

		private Color bgColor;
		
		public ChangeBgColor(Color color) {
			 bgColor = color;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(bgColor);
		}
		
	}
}


