package com.cursojava.sockets.clienteServidor.copy;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

import com.cobo.mylib.CbConstants;


class Servidor extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public Servidor() {
		this.setBounds(1000,400, 400, 300);
		this.add(new PanelServidor());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

class PanelServidor extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextArea txtArea;
	
	public PanelServidor() {
		this.setBackground(new Color(40, 40, 40));
		this.setLayout(new BorderLayout());
		
		txtArea = new JTextArea();
		txtArea.setFont(CbConstants.FONT_INPUT);
		txtArea.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		this.add(txtArea);
		
	}
}