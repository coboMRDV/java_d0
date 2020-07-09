package com.cursojava.poo.abstractas;

import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
	
		
		Temporizador oyente = new Temporizador();
		
		Timer miTemporizador = new Timer(5000,  oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa 'Aceptar' para detener");
	}

}


class Temporizador implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Date date = new Date();
		System.out.println("Hello World!. Today is " + date);
	}
}