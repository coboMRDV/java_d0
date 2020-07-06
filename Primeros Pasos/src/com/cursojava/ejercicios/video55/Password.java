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
		 * En ASCII: Los n�meros del 0 al 9 tienen los c�digos de 48 a 57 Las letras,
		 * (a-z, A-Z) tienen los c�digos de 65 a 122
		 * 
		 * Mays: 65 - 90 
		 * Mins: 97 - 122
	
		 * Voy a crear un m�todo que haga algo como un cara o cruz par decidir si cada
		 * car�cter del pass va a ser n�mero o letra y de ser letra si va a ser
		 * may�scula o min�scula
	
		 */
		String str = "";
		for (int i = 0; i < length; i++) {
			
			int numOrLetter = headsOrTail();
			int mayOrMin = headsOrTail();

			if (numOrLetter == 1) {
//				n�mero
				short num = (short) new Random().nextInt(9);
				str += num;
			} else {
				if (mayOrMin == 1) {
//					may�sculas
					int num = new Random().nextInt(91 - 65) + 65;
					str += (char) num;
				} else {
//					min�sculas
					int num = new Random().nextInt(123 - 97) + 97;
					str += (char) num;
				}
			}
		}
		return str;
	}

	public boolean isSafe(String pass) {
		/*
		 * Se considerar� contrase�a segura aquella que est� formada por m�s de cinco n�meros,
		 * tenga m�s de una letra min�scula y m�s de dos letras may�sculas.
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
	 * Genera un n�mero 1 - 2 que usar� para decidir entre letra o n�mero y entre
	 * may�scula y min�scula en la creaci�n del password
	 * 
	 * @return short (1 - 2)
	 */
	private int headsOrTail() {
		int num = new Random().nextInt(2) + 1;

		return num;
	}
}
