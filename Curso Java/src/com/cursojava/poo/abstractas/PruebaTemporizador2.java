package com.cursojava.poo.abstractas;

import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

public class PruebaTemporizador2 {

	public static void main(String[] args) {

		Timer myTimer = new Timer(3000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(String.format(
						"Hello World! Today is %s", new Date()));
			}
		});

		myTimer.start();
		JOptionPane.showMessageDialog(null, "Pulsa 'Aceptar', para cerrar");
	}

}