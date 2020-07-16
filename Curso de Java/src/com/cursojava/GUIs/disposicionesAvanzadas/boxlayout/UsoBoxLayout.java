package com.cursojava.GUIs.disposicionesAvanzadas.boxlayout;

import java.awt.*;

import javax.swing.*;

public class UsoBoxLayout {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1020268689345422676L;

	public Frame() {
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(40, 40, 40));

		Font font = new Font("InputMono", Font.PLAIN, 18);

		JLabel lblUsuario = new JLabel("Nombre");
		JTextField txtUsuario = new JTextField(10);

		txtUsuario.setMaximumSize(txtUsuario.getPreferredSize());

//		----------- USER BOX ------------

		Box userBox = Box.createHorizontalBox();
		userBox.add(lblUsuario);
		userBox.add(Box.createHorizontalStrut(10));
		userBox.add(txtUsuario);

//		--------   PASSWORLD BOX -------------

		JLabel lblPass = new JLabel("Contraseña");
		JTextField txtPass = new JTextField(10);

		txtPass.setMaximumSize(txtPass.getPreferredSize());

		Box passBox = Box.createHorizontalBox();
		passBox.add(lblPass);
		passBox.add(Box.createHorizontalStrut(10));
		passBox.add(txtPass);

//		-----------  BUTTONS BOX ---------------------

		lblUsuario.setFont(font);
		lblPass.setFont(font);
		lblUsuario.setForeground(new Color(200, 200, 200));
		lblPass.setForeground(new Color(200, 200, 200));
		txtUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		txtPass.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

//		--------------VERTICAL BOX ---------------------
		Box buttonBox = Box.createHorizontalBox();
		JButton btn1 = new JButton("Ok");
		JButton btn2 = new JButton("Cancelar");

		buttonBox.add(btn1);
		buttonBox.add(Box.createGlue());
		
		buttonBox.add(btn2);

//	    /* =============		============ */



		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBorder(BorderFactory.createEmptyBorder(24, 24, 24, 24));

		verticalBox.add(userBox);
		verticalBox.add(passBox);
		verticalBox.add(buttonBox);

		this.add(verticalBox);
	}

}
