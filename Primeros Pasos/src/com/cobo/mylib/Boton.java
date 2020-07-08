package com.cobo.mylib;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 * Crea un boton con una fuente
 * distinta a la fuente por defecto
 * 
 * @author Cobo
 *
 */
public class Boton extends JButton {
		
		String nombre; 
		
		/**
		 * Constructor de la clase Boton
		 * Recibe como parámetro el nombre que se mostrará en el botón
		 * 
		 * @param nombre String nombre del botón
		 */
		public Boton(String nombre) {
			this.setText(nombre);
			this.setFont(new Font("InputMono Thin", Font.PLAIN, 18));
			this.setBorder(BorderFactory.createEmptyBorder(10, 40, 10, 40));

			this.setForeground(new Color(255, 255, 255));
			this.setBackground(new Color(19, 132, 150));
		}
		
				
		/**
		 * Establece un padding para el botón
		 * 
		 * @param top int padding-top
		 * @param right int padding-right
		 * @param bottom int padding-bottom
		 * @param left int padding-left
		 */
		public void setPadding(int top, int right, int bottom, int left) {
			this.setBorder(BorderFactory.createEmptyBorder(top, right, bottom, left));
		}
		


	}

