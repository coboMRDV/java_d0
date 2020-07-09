package com.cursojava.GUIs.eventos.mouse2;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
	private static final long serialVersionUID = -8252244158278275478L;

	public Frame() {
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(50, 50, 50));
		
		this.addMouseListener(new MouseEvents());
		
		this.setVisible(true);
	}
}

class MouseEvents implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(String.format(
				"Has hecho click en el punto "
				+ "[x]:%d "
				+ "[y]:%d" , 
				e.getX(), e.getY()));
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Has entrado");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Has salido");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("Estás presionando una tecla");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("Has soltado la tecla");
	}
	
}