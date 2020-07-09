package com.cursojava.GUIs.eventos.teclado;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class EventoTeclado {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class Frame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2016622262086949748L;

	public Frame() {
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(50, 50, 50));
		
		this.addKeyListener(new KeyEvents());
	
		this.setVisible(true);
				
	}
}



class KeyEvents implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(String.format("Has pulsado la tecla %s", e.getKeyChar()));
	}

	@Override
	public void keyReleased(KeyEvent e) {
//		System.out.println("Has soltado una tecla");
	}

	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("Has tecleado una tecla");
	}
	
}