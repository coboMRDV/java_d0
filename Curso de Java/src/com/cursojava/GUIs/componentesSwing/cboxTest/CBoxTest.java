package com.cursojava.GUIs.componentesSwing.cboxTest;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.cobo.mylib.CbConstants;

public class CBoxTest {

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
	private static final long serialVersionUID = 1L;

	public Frame() {
		this.setSize(400, 280);
		this.setLocationRelativeTo(null);

		this.add(new Panel());
	}

}

class Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lbl1;
	private int fontStyle = 0;

	public Panel() {
//		this.setBackground(new Color(55, 55, 55));

		this.setLayout(new BorderLayout(3, 3));

		lbl1 = new JLabel("Lorem ipsum dolor sit amet");
		lbl1.setFont(CbConstants.FONT_SANS);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);

		JCheckBox c1 = new JCheckBox("Negrita");
		c1.addActionListener(new JCheckBoxEventHandler());
		JCheckBox c2 = new JCheckBox("Cursiva");
		c2.addActionListener(new JCheckBoxEventHandler());

		JPanel cBoxes = new JPanel();
		cBoxes.add(c1);
		c1.setFont(CbConstants.FONT_SANS);
		cBoxes.add(c2);
		c2.setFont(CbConstants.FONT_SANS);

		this.add(lbl1, BorderLayout.NORTH);
		this.add(cBoxes, BorderLayout.SOUTH);
	}

	private class JCheckBoxEventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			JCheckBox clicked = (JCheckBox) e.getSource();

			if (clicked.getText().equals("Negrita")) {
				if (clicked.isSelected()) {
					fontStyle += Font.BOLD;
				} else {
					fontStyle -= Font.BOLD;
				}
			} else {
				if (clicked.isSelected()) {
					fontStyle += Font.ITALIC;
				} else {
					fontStyle -= Font.ITALIC;
				}
			}

			lbl1.setFont(new Font("Sans Serif", fontStyle, 16));
		}

	}
}