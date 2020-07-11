package com.cursojava.GUIs.componentesSwing.cbox2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cobo.mylib.CbConstants;

public class UsoCheckBox {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {
	private JLabel lbl1 = new JLabel("Lorem ipsum dolor sit amet");
	private int initialFontStyle = 0;

	public Frame() {
		this.setSize(400, 280);
		this.setLocationRelativeTo(null);

		BorderLayout blo = new BorderLayout(3, 3);
		this.setLayout(blo);

		this.add(new TopPanel(), BorderLayout.NORTH);
		this.add(new BottomPanel(), BorderLayout.SOUTH);
	}

//	***		TOP PANEL	 ***	//
	class TopPanel extends JPanel {

		public TopPanel() {
//		this.setBackground(new Color(55, 55, 55));/
			lbl1.setFont(CbConstants.FONT_SANS);

			this.add(lbl1);

		}

	}
//	***		TOP PANEL	 ***	//
	private class BottomPanel extends JPanel {
		JCheckBox box1, box2;

		private BottomPanel() {

			box1 = new JCheckBox("Negrita");
			box1.setFont(CbConstants.FONT_SANS);
			box2 = new JCheckBox("Cursiva");
			box2.setFont(CbConstants.FONT_SANS);

			box1.addActionListener(new JCheckBoxEventHandler());
			box2.addActionListener(new JCheckBoxEventHandler());
			
			

			this.add(box1);
			this.add(box2);

		}

		private class JCheckBoxEventHandler implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {

				JCheckBox clicked = (JCheckBox) e.getSource();
				if (clicked.getText().equals("Negrita")) {
					if (clicked.isSelected()) {
						initialFontStyle += 1;
					} else {
						initialFontStyle -= 1;
					}
				} else {
					if (clicked.isSelected()) {
						initialFontStyle += 2;
					} else {
						initialFontStyle -= 2;
					}
				}
				
				lbl1.setFont(new Font("Sans Serif", initialFontStyle, 16));
			}

		}
	}

}
