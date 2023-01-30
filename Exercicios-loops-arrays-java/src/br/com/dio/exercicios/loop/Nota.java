package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		while(true) {
			System.out.println("digite notas de 0 a 10 " );
			nota = scan.nextInt();
			if(nota < 0 || nota > 10) {
				System.out.println("Nota incorreta");
			}
			
		}
	}
}
