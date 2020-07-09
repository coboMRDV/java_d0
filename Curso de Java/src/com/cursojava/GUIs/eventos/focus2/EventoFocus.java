package com.cursojava.GUIs.eventos.focus2;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cobo.mylib.CButton;

public class EventoFocus {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		Frame frame2 = new Frame();
		frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}

class Frame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5582791869884184032L;
	private static int nInstance = 1;
	private int nVentana = nInstance;

	public Frame() {
		this.setSize(640, 360);
		this.setLocationRelativeTo(null);
		this.setTitle(String.format("Ventana %d", nVentana));
		nInstance++;

		this.add(new Panel());

		this.addWindowFocusListener(new WindowFocusListener() {
			
			@Override
			public void windowLostFocus(WindowEvent e) {
			}
			
			@Override
			public void windowGainedFocus(WindowEvent e) {
				Frame f = (Frame) e.getSource();
				System.out.println(String.format("Focus en ventana %d", f.nVentana));
			}
		});

		this.setVisible(true);
	}

}

class Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6031141620409434801L;
	CButton btn1 = new CButton("Botón 1");
	CButton btn2 = new CButton("Botón 2");
	CButton btn3 = new CButton("Botón 3");
	CButton btn4 = new CButton("Botón 4");

	public Panel() {
		this.setBackground(new Color(50, 50, 50));

		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);

	}

}