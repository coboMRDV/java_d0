package com.cursojava.entradaSalida;
import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		######### EJERCICIO 1 ##########
//		System.out.println("Write your name, please: ");
//		String name = sc.nextLine();
//		System.out.println("Hello " + name + ". How are you today?");
//		sc.close();
		
//		######### EJERCICIO 2 ##########
//		System.out.println("Write a number, please: ");
//		int num1 = sc.nextInt();
//				
//		System.out.println("Write a second number: ");
//		int num2 = sc.nextInt();
//		
//		int result = num1 + num2;
//		System.out.println("Result: " + result);
		
		
//		######### EJERCICIO 3 ##########
		System.out.println("Write your age, please: ");
		int age = sc.nextInt();

		System.out.println("Write your name, please: ");
		sc.nextLine();
		String name = sc.nextLine();
		
				
		System.out.println(
				"Your name is " + name + ". And you are " + age + " years old");
		
		sc.close();
	}

}