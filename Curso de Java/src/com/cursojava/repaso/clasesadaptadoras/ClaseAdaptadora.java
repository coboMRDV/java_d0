package com.cursojava.repaso.clasesadaptadoras;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;




public class ClaseAdaptadora {
	public static void main(String[] args) {
		Frame window1 = new Frame();
		window1.setTitle("Windows 1");
	
	}
}


class Frame extends JFrame {

	public Frame() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		this.addWindowListener(new WindowEventsHandler());
		
		
	}

	
	private class WindowEventsHandler extends WindowAdapter{
		
		@Override
		public void windowDeiconified(WindowEvent arg0) {
			System.out.println("Window Deiconified");
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			System.out.println("Window Iconified");
		}

			
	}


}
