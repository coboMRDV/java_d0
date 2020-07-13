package com.cursojava.repaso.variasfuentes2;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class VariasFuentes {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {
		
	public Frame() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);

		this.add(new Panel());
	}

}

class Panel extends JPanel {
	JButton btnRed,btnGreen, btnBlue;
	
	public Panel() {
		this.setBackground(new Color(40, 40, 40));
		
		//**** CREAT ACTIONS ****//
		ChangeBackGroundColor toRed = new ChangeBackGroundColor("Red", new Color(100, 40, 40));
		ChangeBackGroundColor toGreen = new ChangeBackGroundColor("Green", new Color(40, 100, 40));
		ChangeBackGroundColor toBlue = new ChangeBackGroundColor("Blue", new Color(40, 40, 100));
		
		btnRed = new JButton(toRed);
		btnGreen = new JButton(toGreen);
		btnBlue = new JButton(toBlue);
		
		this.add(btnRed);
		this.add(btnGreen);
		this.add(btnBlue);
		
		/** GET INPUT Y ACTION MAPS **/
		InputMap inputMap = this.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
		ActionMap actionMap = this.getActionMap();
		
		/** ADD SHORTCUT IN THE INPUTMAP**/
		inputMap.put(KeyStroke.getKeyStroke("ctrl R"), "actionRed");
		actionMap.put("actionRed", toRed);
		inputMap.put(KeyStroke.getKeyStroke("ctrl G"), "actionGreen");
		actionMap.put("actionGreen", toGreen);
		inputMap.put(KeyStroke.getKeyStroke("ctrl B"), "actionBlue");
		actionMap.put("actionBlue", toBlue);
		
		
	}
	
	private class ChangeBackGroundColor extends AbstractAction{
		
		public  ChangeBackGroundColor(String buttonName, Color color) {
			putValue(AbstractAction.NAME, buttonName);
			putValue("bgColor", color);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground((Color) getValue("bgColor"));
		}
		
	}
}