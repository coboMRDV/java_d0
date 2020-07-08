package com.cobo.mylib;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 * Crea un boton con un aspecto diferente
 * al bot�n default crado con java swing
 * 
 * @author Cobo
 *
 */
public class CButton extends JButton {

	String nombre;

	/**
	 * Constructor de la clase Boton Recibe como par�metro el nombre que se mostrar�
	 * en el bot�n
	 * 
	 * @param nombre el nombre del bot�n
	 */
	public CButton(String nombre) {
		this.setText(nombre);
		this.setFont(new Font("Consolas", Font.PLAIN, 14));
		this.setBorder(BorderFactory.createEmptyBorder(6, 12, 6, 12));
		this.setForeground(new Color(255, 255, 255));
		this.setBackground(new Color(19, 132, 150));
	}

	/**
	 * Establece un padding para el bot�n
	 * 
	 * @param top    un int especificando padding-top
	 * @param right  un int especificando padding-right
	 * @param bottom un int especificando padding-bottom
	 * @param left   un int especificando padding-left
	 */
	public void setPadding(int top, int right, int bottom, int left) {
		this.setBorder(BorderFactory.createEmptyBorder(top, right, bottom, left));
	}

}
