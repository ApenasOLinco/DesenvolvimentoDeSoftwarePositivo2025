package lista1.vetores;

import java.util.Random;
import java.util.Scanner;

/*
 * Escreva um programa alimente um vetor de 5 números { inteiros DISTINTOS }. Em seguida, leia um número 
 * qualquer do teclado e mostre na tela o índice em que ele se encontra no vetor, ou então a mensagem 
 * "Elemento não encontrado!", se ele não estiver presente no vetor.
 */
public class Atividade03 {
	public static void main(String[] args) {
		
		int vetor[] = new int[5], procurado;
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		// População e impressão do vetor
		System.out.print("{ ");
		for(int i = 0; i < vetor.length; i ++) {
			// População
			int elemento;
			
			do {
				elemento = r.nextInt(10);
			} while(existeNoVetor(elemento, vetor) > 0);
			
			vetor[i] = elemento; 
			
			// Impressão
			System.out.printf(" %d", elemento);
			
			if(i < vetor.length - 1) {
				System.out.print("; ");
			}
		}
		System.out.println(" }");
		
		// Input do usuário
		System.out.print("Insira um número para ser procurado no vetor: ");
		procurado = s.nextInt();
		
		int encontrado = existeNoVetor(procurado, vetor);
		
		if(encontrado > 0) {
			System.out.println("Posição no vetor: " + encontrado + ".");
		} else {
			System.out.println("Número não existe no vetor.");
		}
		
		s.close();
		
	}
	
	/** Retorna o índice que o elemento fornecido se encontra no vetor, se ele existir. Caso contrário, retorna -1. */
	private static int existeNoVetor(int elemento, int vetor[]) {
		for(int i = 0; i < vetor.length; i ++) {
			if(vetor[i] == elemento) return i;
		}
		
		return -1;
	}
}

























