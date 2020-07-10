package com.cursojava.GUIs.layout.calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.cobo.mylib.CButton;

/*
 * Hay que crear una calculadora
 * Tendrá que mostar un panel superior (donde habrá que escribir)
 * Y uno inferior con los números
 * 
 * Estará compuesto por:
 * - 1 Frame principal
 * - 2 Panele interiores | El display y el teclado numérico
 *  
 * El frame principal será un border layout
 * - north para el display | esto será un borderlayout con TextField en center
 * - center para las teclas | esto un gridlayout de 4 x 5
 *   
 */

public class Calculadora {

	public static void main(String[] args) {
		FrameCalculadora f = new FrameCalculadora();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class FrameCalculadora extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9146735802414776920L;
	JTextField txtPanel = new JTextField();
	int num1 = 0;
	int num2 = 0;
	String operador = "";

	public FrameCalculadora() {
		this.setSize(300, 350);
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(new Color(55, 55, 55));

		this.setLayout(new BorderLayout(3, 3));

		this.add(new Display(), BorderLayout.NORTH);
		this.add(new PanelNumerico(), BorderLayout.CENTER);

		this.setVisible(true);
	}

	class Display extends JPanel {


		private static final long serialVersionUID = -5356553302419766469L;

		public Display() {
			this.setBackground(new Color(55, 55, 55));
			this.setLayout(new BorderLayout(3, 3));

			txtPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
			txtPanel.setText("0");
			txtPanel.setFont(new Font("InputMono", Font.PLAIN, 20));
			txtPanel.setHorizontalAlignment(SwingConstants.RIGHT);
			txtPanel.setBackground(new Color(230, 230, 230));

			this.add(txtPanel, BorderLayout.NORTH);
		}

		public String getDisplayText() {
			return txtPanel.getText();
		}

		public void setDisplayText(String text) {
			txtPanel.setText(text);
		}

	}

	class PanelNumerico extends JPanel {


		private static final long serialVersionUID = 3993081903443093031L;

		public PanelNumerico() {
			this.setBackground(new Color(55, 55, 55));
			this.setBorder(BorderFactory.createEmptyBorder(2, 4, 4, 4));
			this.setLayout(new GridLayout(4, 5, 5, 5));

			CButton btn7 = (new CButton("7"));
			CButton btn8 = (new CButton("8"));
			CButton btn9 = (new CButton("9"));
			CButton btnDiv = (new CButton("/"));
			btn7.addActionListener(new ButtonEvent());
			btn8.addActionListener(new ButtonEvent());
			btn9.addActionListener(new ButtonEvent());
			btnDiv.addActionListener(new ButtonEvent());
			this.add(btn7);
			this.add(btn8);
			this.add(btn9);
			this.add(btnDiv);

			CButton btn4 = (new CButton("4"));
			CButton btn5 = (new CButton("5"));
			CButton btn6 = (new CButton("6"));
			CButton btnTimes = (new CButton("x"));
			btn4.addActionListener(new ButtonEvent());
			btn5.addActionListener(new ButtonEvent());
			btn6.addActionListener(new ButtonEvent());
			btnTimes.addActionListener(new ButtonEvent());
			this.add(btn4);
			this.add(btn5);
			this.add(btn6);
			this.add(btnTimes);

			CButton btn1 = (new CButton("1"));
			CButton btn2 = (new CButton("2"));
			CButton btn3 = (new CButton("3"));
			CButton btnMinus = (new CButton("-"));
			btn1.addActionListener(new ButtonEvent());
			btn2.addActionListener(new ButtonEvent());
			btn3.addActionListener(new ButtonEvent());
			btnMinus.addActionListener(new ButtonEvent());
			this.add(btn1);
			this.add(btn2);
			this.add(btn3);
			this.add(btnMinus);

			CButton btn0 = (new CButton("0"));
			CButton btnDot = (new CButton("."));
			CButton btnEqual = (new CButton("="));
			CButton btnPlus = (new CButton("+"));
			btn0.addActionListener(new ButtonEvent());
			btnDot.addActionListener(new ButtonEvent());
			btnEqual.addActionListener(new ButtonEvent());
			btnPlus.addActionListener(new ButtonEvent());
			this.add(btn0);
			this.add(btnDot);
			this.add(btnEqual);
			this.add(btnPlus);
		}

	}

	class ButtonEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			CButton pushedButton = (CButton) e.getSource();

			String txtDisplayNow = txtPanel.getText();
			String pushedKey = pushedButton.getText();


			if (txtDisplayNow.equals("0")) {
				txtPanel.setText(pushedKey);
				num1 = Integer.parseInt(pushedKey);
			} else if (pushedKey.equals("+") || pushedKey.equals("-") || pushedKey.equals("x")|| pushedKey.equals("/")) {
				operador = pushedKey;
				txtDisplayNow += "" + pushedKey;
				txtPanel.setText(txtDisplayNow);

			} else if (pushedKey.equals("=")) {
				int resultado = ejecutaOperacion(num1, num2, operador);
				num1 = resultado;
				txtPanel.setText(String.valueOf(resultado));

			} else {
				num2 = Integer.parseInt(pushedKey);
				txtDisplayNow += "" + pushedKey;
				txtPanel.setText(txtDisplayNow);
			}

		}

	}

	public int ejecutaOperacion(int num1, int num2, String operador) {
		int retVal = 0;

		switch (operador) {
		case "+":
			retVal = num1 + num2;
			break;

		case "-":
			retVal = num1 - num2;
			break;

		case "x":
			retVal = num1 * num2;
			break;

		case "/":
			retVal = num1 / num2;
			break;
		default:
			break;
		}

		return retVal;

	}

}
