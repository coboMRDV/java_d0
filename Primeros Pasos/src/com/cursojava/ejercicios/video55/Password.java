package com.cursojava.ejercicios.video55;

import java.util.Random;

public class Password {
//	properties
	int length;
	String pass;

	public Password(int length) {
		this.length = length;
		pass = createPass(length);
	}

	public int getLength() {
		return length;
	}

	public String getPass() {
		return this.pass;
	}

	private String createPass(int length) {
		/*
		 * En ASCII: Los números del 0 al 9 tienen los códigos de 48 a 57 Las letras,
		 * (a-z, A-Z) tienen los códigos de 65 a 122
		 * 
		 * Mays: 65 - 90 
		 * Mins: 97 - 122
	
		 * Voy a crear un método que haga algo como un cara o cruz par decidir si cada
		 * carácter del pass va a ser número o letra y de ser letra si va a ser
		 * mayúscula o minúscula
	
		 */
		String str = "";
		for (int i = 0; i < length; i++) {
			
			int numOrLetter = headsOrTail();
			int mayOrMin = headsOrTail();

			if (numOrLetter == 1) {
//				número
				short num = (short) new Random().nextInt(9);
				str += num;
			} else {
				if (mayOrMin == 1) {
//					mayúsculas
					int num = new Random().nextInt(91 - 65) + 65;
					str += (char) num;
				} else {
//					minúsculas
					int num = new Random().nextInt(123 - 97) + 97;
					str += (char) num;
				}
			}
		}
		return str;
	}

	public boolean isSafe(String pass) {
		/*
		 * Se considerará contraseña segura aquella que esté formada por más de cinco números,
		 * tenga más de una letra minúscula y más de dos letras mayúsculas.
		 */
		
		int nums = 0;
		int mays = 0;
		int mins = 0;
		
		for(int i = 0; i < pass.length(); i ++) {
			int c = (int)pass.charAt(i);
			if(c >= 48 && c <= 57) {
				nums ++;
			}else {
				if(c >= 65 && c <= 90 ) {
					mays ++;
				}else {
					mins ++;
				}
			}
		}

		
		boolean result = false;
		if(nums > 5 && mays > 2 && mins > 1) {
			result = true;
		}

		return result;
				
	}

	/**
	 * Genera un número 1 - 2 que usaré para decidir entre letra o número y entre
	 * mayúscula y minúscula en la creación del password
	 * 
	 * @return short (1 - 2)
	 */
	private int headsOrTail() {
		int num = new Random().nextInt(2) + 1;

		return num;
	}
}
