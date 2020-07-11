package com.cursojava.GUIs.componentesSwing.jspinner;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.cobo.mylib.CbConstants;
import com.cobo.mylib.CbFunctions;

public class UsoJSpinner {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Frame extends JFrame {

	public Frame() {
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);

		this.add(new Panel());
	}

}

class Panel extends JPanel {
	private final JSpinner jSpinner;
	
	public Panel() {
		jSpinner = new JSpinner(new SpinnerNumberModel(0, -5, 15, 1)) ;
		
		jSpinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				JSpinner js = (JSpinner)e.getSource();
				System.out.print(js.getValue() + " ");
			}
		});
		
		this.add(jSpinner);
	}
}

