package com.cursojava.sockets.clienteServidor;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;

import javax.swing.*;

import com.cobo.mylib.CbConstants;

class Servidor extends JFrame implements Runnable {
	private static final long serialVersionUID = 1L;
	private JTextArea txtArea;

	public Servidor() {
		createFrame();
		
		Thread miHilo = new Thread(this);
		miHilo.start();
	}

	public void createFrame() {
		this.setBounds(1000, 400, 500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		txtArea = new JTextArea();
		txtArea.setFont(CbConstants.FONT_INPUT);
		txtArea.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));

		panel.add(txtArea);
		this.add(panel);

		this.setVisible(true);
	}

	@Override
	public void run() {
		
		try {
			@SuppressWarnings("resource")
			ServerSocket miServidor = new ServerSocket(9999); 	// Puerto a la escucha
			
			while(true) {
				
				Socket miSocket = miServidor.accept();				//Acepta las conexiones del socket
				
				// Flujo de entrada de datos
				DataInputStream flujoEntrada = new DataInputStream(miSocket.getInputStream());
				
				String mensajeTexto = flujoEntrada.readUTF();
				
				txtArea.append(mensajeTexto + "\n");
				miSocket.close();
				
			}
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
