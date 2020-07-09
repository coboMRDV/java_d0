package com.cobo.mylib;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 * Crea un boton con un aspecto diferente
 * al botón default crado con java swing
 * 
 * @author Cobo
 *
 */
public class CButton extends JButton {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1410906471974689420L;
	String nombre;

	/**
	 * Constructor de la clase Boton Recibe como parámetro el nombre que se mostrará
	 * en el botón
	 * 
	 * @param text el nombre del botón
	 */
	public CButton(String text) {
		super(text);
		this.setFont(new Font("Consolas", Font.PLAIN, 14));
		this.setBorder(BorderFactory.createEmptyBorder(14, 28, 14, 28));
		this.setForeground(new Color(255, 255, 255));
		this.setBackground(new Color(19, 132, 150));
		
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				CButton b = (CButton)e.getSource();
				b.setBackground(new Color(19, 132, 150));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				CButton b = (CButton)e.getSource();
				b.setBackground(new Color(41, 217, 244));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
	}

	/**
	 * Establece un padding para el botón
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
