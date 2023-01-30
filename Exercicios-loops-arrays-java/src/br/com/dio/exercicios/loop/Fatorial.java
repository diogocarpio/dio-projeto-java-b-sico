package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Fatorial: ");
		int fatorial = scan.nextInt();
		
		for(int i = fatorial - 1; i >= 1; i--) { 
			fatorial = fatorial * i;
		}
		
		System.out.println("o resultado do fatorial é " + fatorial);
		
	}
}
