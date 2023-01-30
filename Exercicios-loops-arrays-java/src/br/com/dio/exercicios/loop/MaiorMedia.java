package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class MaiorMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int maior = 0;
		double media = 0;
		int count = 0;
		do {
			
			System.out.println("numero ");
			numero = scan.nextInt();
			count++;
			
			if(numero > maior) {
				maior = numero;
			}
			
			media = numero + media;
			
		} while(count < 5);
		
		System.out.println("o mair numero é " + maior);
		System.out.println("a média dos número é " + media/5);
	}
}
