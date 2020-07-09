package com.cursojava.ejercicios.video55;

import java.util.Random;

public class Password {
//	properties
	int length;
	String pass;

	/**
	 * Genera un password aleatorio con un n�mero 
	 * determinado de caracteres seleccionado por el usuario
	 * 
	 * @param length int n�mero de caracteres del password
	 */
	public Password(int length) {
		this.length = length;
		pass = createPass(length);
	}

	/**
	 * Devuelve la longitud del password
	 * 
	 * @return int longitud del password
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Devuelve el password
	 * 
	 * @return String password generado
	 */
	public String getPass() {
		return this.pass;
	}

	/**
	 * Genera el password.
	 * Recibe como argumento el tama�o deseado para el password
	 * 
	 * Se realiza un bucle con tantas iteraciones como caracteres
	 * vaya a tener el password. A cada iteraci�n se elige al azar
	 * mediante otro m�tido (como una tirada de moneda)
	 * si el caracter va a ser n�mero o letra y de ser letra si ser�
	 * may�scula o min�scula. Al final de cada iteraci�n se a�ade 
	 * el car�cter a la string
	 * 
	 * @param length int n�mero de caracteres del password
	 * @return String password
	 */
	private String createPass(int length) {
		/*
		 * En ASCII: Los n�meros del 0 al 9 tienen los c�digos de 48 a 57 Las letras,
		 * (a-z, A-Z) tienen los c�digos de 65 a 122
		 * 
		 * Mays: 65 - 90 
		 * Mins: 97 - 122
		 *
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

	/**
	 * Determina si un password es seguro o no, de acuerdo con una serie de
	 * premisas
	 * 
	 * Se considerar� contrase�a segura aquella que est� formada por m�s de cinco n�meros,
	 * tenga m�s de una letra min�scula y m�s de dos letras may�sculas.
	 * 
	 * @param pass String que se va a evaluar
	 * @return boolean true si fuera segura, false en caso contrario
	 */
	public boolean isSafe(String pass) {
		/*
		 * 
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
