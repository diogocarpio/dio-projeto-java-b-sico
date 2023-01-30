package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Consoantes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] consoantes = new String[6];
		int quantidadeConsoantes = 0;
		int count = 0;
		
		do {
			System.out.println("Letra: ");
			String letra =scan.next();
			
			if(letra.contentEquals("a") || 
					letra.contentEquals("e") ||
					letra.contentEquals("i") ||
					letra.contentEquals("o") ||
					letra.contentEquals("u")) {
				consoantes[count] = letra;
				quantidadeConsoantes++;
			}
			
			count++;
			
		} while(count < consoantes.length);
		
		for (String consoante : consoantes) {
			if(consoante != null) {
			System.out.println(consoante + " ");
			}	
		}
		
	}

}
