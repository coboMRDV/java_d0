package com.cursojava.poo.abstractas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador3 {
	public static void main(String[] args) {

		Reloj miReloj = new Reloj();
		miReloj.ejecutarTemporizador(3000, true);

		JOptionPane.showMessageDialog(null, "Presiona 'Aceptar' para cerrar");
	}
}

class Reloj {

	public void ejecutarTemporizador(int intervalo, boolean sonido) {

//		class DameLaHora implements ActionListener {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Hora: " + new Date());
//		Toolkit tk = Toolkit.getDefaultToolkit();
//		if (sonido)
//			tk.beep();
//
//			}
//
//		}
//
//		ActionListener oyente = new DameLaHora();

		Timer miTemporizador = new Timer(intervalo, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hora: " + new Date());
				Toolkit tk = Toolkit.getDefaultToolkit();
				if (sonido)
					tk.beep();
			}
			
		});
		miTemporizador.start();

	}

}