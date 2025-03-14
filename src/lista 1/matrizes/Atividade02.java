package matrizes;

import java.util.Random;

/*
 * Escreva um programa que leia uma matriz de 5 x 5 elementos e, utilizando estruturas de repetição, 
 * apresente na tela a soma de todos os elementos da terceira linha da matriz:
 * . . . . .
 * . . . . .
 * x x x x x
 * . . . . .
 * . . . . .
 */
public class Atividade02 {
	public static void main(String[] args) {
		int matriz[][] = new int[5][5], soma = 0;
		Random random = new Random();
		
		System.out.println("Matriz:");
		System.out.println("[");
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(10) + 1;
				System.out.printf("\t %d", matriz[i][j]);
				
				if(i == 2) {
					soma += matriz[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("]");
		System.out.printf("Soma: %d", soma);
	}
}





















