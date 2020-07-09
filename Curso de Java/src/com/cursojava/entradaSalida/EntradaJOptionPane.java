package com.cursojava.entradaSalida;
import javax.swing.*;

public class EntradaJOptionPane {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Write your name, please:" );
		int  age = 
				Integer.parseInt(
						JOptionPane.showInputDialog("Now rite your age, please:" ));
		
		System.out.println(
				"Your name is " + name + ". You are " + age + " years old");
		
	}

}
