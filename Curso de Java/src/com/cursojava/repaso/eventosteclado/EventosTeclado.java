package com.cursojava.repaso.eventosteclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {

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
	private static final long serialVersionUID = 6411985258030218786L;

	public Frame() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		
		this.addKeyListener(new KeyEventsHandler());

	}

}

class KeyEventsHandler implements KeyListener{
	

	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_J) {
			System.out.println("You have pressed 'J'");
		}
		
		System.out.println("Has pulsado la tecla " + KeyEvent.getKeyText(e.getKeyCode()));
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
 
	}
	
}

