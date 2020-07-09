package com.cursojava.GUIs.eventos.focus;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.cobo.mylib.CButton;

public class EventoFocus {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class Frame extends JFrame{
	public static int nInstance = 1;
	
	public Frame() {
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setTitle("Ventana " + nInstance);
		
		this.add(new Panel());
		
		nInstance ++;
		this.setVisible(true);
	}
}


class Panel extends JPanel{
	CButton btn1 = new CButton("Botón 1");
	CButton btn2 = new CButton("Botón 2");
	CButton btn3 = new CButton("Botón 3");
	CButton btn4 = new CButton("Botón 4");
//	test
	
	public Panel() {
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
	}
	
	
	
}