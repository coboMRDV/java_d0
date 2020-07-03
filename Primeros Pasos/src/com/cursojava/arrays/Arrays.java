package com.cursojava.arrays;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		int[] valores = new int[10];
		valores[0] = 3;

		for (int i = 0; i < valores.length; i++) {
			Random r = new Random();
//			r.nextInt((max-min) + 1) + min
			int num = r.nextInt((10 - 1) + 1) + 1;
			valores[i] = num;
		}

		for (int i = 0; i < valores.length; i++) {
			System.out.print("[" + valores[i] + "]");
		}
		
		String[] personas = {"Juan", "María", "Antonio", "Laura"};
		System.out.println();
		for(int i = 0; i < personas.length; i ++) {
			System.out.print(personas[i] + ", ");
		}
	}

}
