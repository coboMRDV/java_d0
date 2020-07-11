package com.cobo.mylib;

import java.awt.GraphicsEnvironment;

public class CbFunctions {
	
	public static String[] getAvailableFonts() {
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); 
	}
	
}
