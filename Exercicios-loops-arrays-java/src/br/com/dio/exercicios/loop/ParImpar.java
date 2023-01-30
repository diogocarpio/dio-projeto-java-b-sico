package br.com.dio.exercicios.loop;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numeros = 0;
		int numerosPares = 0;
		int numerosImpares = 0;
		int count = 0;
		
		do {
			System.out.println("digite um numero: ");
			numeros = scan.nextInt();
			
			if(numeros%2 == 0) {
				numerosPares++;
			} else {
				numerosImpares++;
			}
			
			count++;
		} while(count < 5);
		
		System.out.println("A quantidade de numeros pares é " + numerosPares);
		System.out.println("A quantidade de numeros impares é " + numerosImpares);
	}

}
