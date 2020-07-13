package com.cobo.mylib;

import java.awt.GraphicsEnvironment;

import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class CbFunctions {
	
	public static String[] getAvailableFonts() {
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); 
	}
	
	public static InputMap getInputMap(JPanel panel) {
		return panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
	}
	
}
