package com.cursojava.repaso.eventosventana;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;


public class EventosVentana {

	public static void main(String[] args) {
		Frame window1 = new Frame();
		window1.setTitle("Windows 1");
//		Frame window2 = new Frame();
//		window2.setTitle("Window 2");
	}

}

class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1915674621502929637L;


	public Frame() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		this.addWindowListener(new WindowEventsHandler());
		
		
	}

	
	private class WindowEventsHandler implements WindowListener{

		@Override
		public void windowActivated(WindowEvent arg0) {
			System.out.println("Window Activated");
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			System.out.println("Window Closed");
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			System.out.println("Window Closing");
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			System.out.println("Window Desactivated");
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			System.out.println("Window Deiconified");
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			System.out.println("Window Iconified");
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			System.out.println("Window Opened");
		}
		
	}
}


