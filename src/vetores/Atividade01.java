package vetores;

import java.util.Random;

/*
 * Escreva um programa que alimente um vetor com 5 números inteiros e apresente na tela o vetor em  
 * ordem inversa.
 */

public class Atividade01 {
	
	public static void main(String[] args) {
		int vetor[] = new int[5];
		Random random = new Random();		
		
		for(int i = 0; i < vetor.length; i++)
			vetor[i] = random.nextInt(10); 
		
		for(int i = vetor.length - 1; i >= 0; i--) 
			System.out.println(vetor[i]);
	}
	
}
