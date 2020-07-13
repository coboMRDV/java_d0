package com.cursojava.GUIs.componentesSwing.jspinner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class UsoJSpinner {

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
	private static final long serialVersionUID = -8110972000885534135L;

	public Frame() {
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);

		this.add(new Panel());
	}

}

class Panel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1987261903041687460L;
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

