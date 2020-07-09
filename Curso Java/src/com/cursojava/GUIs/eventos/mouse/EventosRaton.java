package com.cursojava.GUIs.eventos.mouse;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventosRaton {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


class Frame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Frame() {
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(50, 50, 50));
		
		this.addMouseMotionListener((new MouseEvents()));;
				
		this.setVisible(true);
	}
}

class MouseEvents implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("Estás arrastrando el ratón");
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("Estás moviendo");
	}
	
}
