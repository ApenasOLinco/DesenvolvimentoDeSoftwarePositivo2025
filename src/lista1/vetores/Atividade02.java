package lista1.vetores;

import java.util.Random;

/*
 *  Escreva um programa que alimente um vetor com 5 números e calcule a média destes valores. Na 
 *  sequência, apresente na tela os valores que são iguais ou superiores à média.
 */
public class Atividade02 {
	public static void main(String[] args) {
		
		float soma = 0, media, vetor[] = new float[5];
		Random r = new Random();
		
		System.out.print("{ ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = r.nextFloat(10) + 1;
			soma += vetor[i];
			
			System.out.printf("%.1f", vetor[i]);
			
			if (i < vetor.length - 1) {
				System.out.print("; ");
			} else { System.out.println(" }"); }
			
		}
		
		media = soma / vetor.length;
		System.out.printf("Média: %.1f.", media);
	}
}











