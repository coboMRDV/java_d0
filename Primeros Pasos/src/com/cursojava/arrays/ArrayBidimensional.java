package com.cursojava.arrays;
import java.util.Random;

public class ArrayBidimensional {

	public static void main(String[] args) {
//		int[][] numeros = new int[5][3];
//		
//		for( int i = 0; i < 5; i ++) {
//			for (int j = 0; j < 3; j ++){
//				Random r = new Random();
//				numeros[i][j] = r.nextInt((100 - 1) + 1 ) + 1;
//			}
//		}
//		
//		
		
		int[][] numeros = new int[5][3];
		
		for( int i = 0; i < 5; i ++) {
			for (int j = 0; j < 3; j ++){
				
				numeros[i][j] = (int) (Math.random() * 100 )+ 1;
			}
		}
		
		
		
		
//		for( int i = 0; i < 5; i ++) {
//			for (int j = 0; j < 3; j ++){
//				System.out.print(numeros[i][j]+ " " );
//				
//			}
//		}
		
//		System.out.println();
		
		for(int[] dimension1 : numeros) {
			for(int dimension2: dimension1) {
				System.out.print(dimension2 + "\t ");
			}
			System.out.println();
		}
		
		
	}

}
