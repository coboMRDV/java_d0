package com.cursojava.arrays;
import java.util.Random;

public class ArrayBidimensional {

	public static void main(String[] args) {
		int[][] numeros = new int[5][3];
		
		for( int i = 0; i < 5; i ++) {
			for (int j = 0; j < 3; j ++){
				Random r = new Random();
				numeros[i][j] = r.nextInt((100 - 1) + 1 ) + 1;
			}
		}
		
		
		for( int i = 0; i < 5; i ++) {
			for (int j = 0; j < 3; j ++){
				System.out.println(numeros[i][j] );
				
			}
		}
		
		
	}

}
