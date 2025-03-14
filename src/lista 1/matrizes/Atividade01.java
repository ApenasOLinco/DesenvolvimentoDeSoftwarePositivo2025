package matrizes;

import java.util.Random;

/*
 *  Escreva um programa que alimente uma matriz de 2 x 3 elementos inteiros e, utilizando estruturas de
 *  repetição, apresente na tela a soma de todos os elementos da matriz
 */
public class Atividade01 {
	public static void main(String[] args) {
		int matriz[][] = new int[2][3], soma = 0;
		Random random = new Random();
		
		System.out.println("Matriz:");
		System.out.println("[");
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(10) + 1;
				soma += matriz[i][j];
				System.out.printf("\t %d", matriz[i][j]);
			}
			System.out.println();
		}
		System.out.println("]");
		
		System.out.println("Soma: " + soma);
	}
}
