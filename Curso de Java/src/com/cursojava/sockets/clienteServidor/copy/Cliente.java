package com.cursojava.sockets.clienteServidor.copy;

import java.awt.Color;
import javax.swing.*;

import com.cobo.mylib.CbConstants;


	



class Cliente extends JFrame {

	private static final long serialVersionUID = 1L;

	public Cliente() {
		this.setBounds(300,400, 400, 300);
		this.add(new PanelCliente());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}

class PanelCliente extends JPanel {
	
	private static final long serialVersionUID = 7302341314351575517L;
	Color lightColor = new Color(200, 200, 200);
	JLabel lblCliente;
	JTextField txtCliente;
	JButton btnEnviar;
	int x = 30;
	int y = 40;
	
	public PanelCliente() {
		this.setBackground(new Color(60, 60, 60));
		this.setLayout(null);
		
		
		lblCliente = new JLabel("CLIENTE");
		lblCliente.setFont(CbConstants.FONT_INPUT);
		lblCliente.setForeground(lightColor);
		lblCliente.setBounds(x, y, 100, 20);
		
		
		txtCliente = new JTextField(20);
		txtCliente.setFont(CbConstants.FONT_INPUT);
		txtCliente.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		txtCliente.setBounds(x, y + 40, 300, 30);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(CbConstants.FONT_INPUT);
		btnEnviar.setBounds(x, y + 100, 100, 30);
		
		this.add(lblCliente);
		this.add(txtCliente);
		this.add(btnEnviar);
		
	}
}

