package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a tabuada deseja ver? ");
		int tabuada = scan.nextInt();
		
		int resultado;
		
		for(int i=tabuada; i <= 10; i++) {
			for(int y=0; y <= 10; y++) {
				resultado = i * y;
				System.out.println(+ i + " x " + y + " = " + resultado); 
			}
			break;
		}
	}
}
