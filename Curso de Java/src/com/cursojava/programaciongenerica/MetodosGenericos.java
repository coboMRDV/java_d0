package com.cursojava.programaciongenerica;

public class MetodosGenericos {

	public static void main(String[] args) {

		String[] nombresPersonas = { "Sara", "Antonio", "María", "Ana" };
		System.out.println(ExaminaArrays.getMenor(nombresPersonas));

	}

}

class ExaminaArrays {

	public static <T extends Comparable> T getMenor(T[] elArray) {

		T menor = elArray[0];

		for (int i = 1; i < elArray.length; i++) {
			if (menor.compareTo(elArray[i]) > 0) {
				menor = elArray[i];
			}
		}
		return menor;
	}

}
