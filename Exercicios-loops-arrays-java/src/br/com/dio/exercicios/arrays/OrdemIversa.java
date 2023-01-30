package br.com.dio.exercicios.arrays;

public class OrdemIversa {
	public static void main(String[] args) {
		
		int[] vetor = {0, 1, 2, 3, 4, 5};
		int count = 0;
		
		System.out.println("Vetor: ");
		while(count < (vetor.length)) {
			System.out.println("Array " + vetor[count]);
			count++;
		}

		System.out.println("Vetor inverso: ");
		for(int i = (vetor.length - 1); i >=0; i--) {
			System.out.println("Array inverso " + vetor[i]);
		}
	}
}
