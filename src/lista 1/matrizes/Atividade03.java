package matrizes;

import java.util.Random;

/*
 * Escreva um programa que leia uma matriz de 5 x 5 elementos e, utilizando estruturas de repetição, 
 * apresente na tela o menor valor da matriz, o maior valor da matriz, a soma dos valores da matriz e a 
 * média dos valores da matriz
 */
public class Atividade03 {
	public static void main(String[] args) {
		int matriz[][] = new int[5][5],
			maior = Integer.MIN_VALUE,
			menor = Integer.MAX_VALUE,
			soma = 0;
		
		float media;
		Random random = new Random();
		
		System.out.println("Matriz: ");
		System.out.println("[");
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				int gerado = random.nextInt(10) + 1;
				
				soma += gerado;
				if(gerado < menor) menor = gerado;
				if(gerado > maior) maior = gerado;
				
				System.out.printf("\t%d", gerado);
			}
			
			System.out.println();
		}
		System.out.println("]");
		
		media = (float) soma / (matriz.length * matriz[0].length);
		
		System.out.println();
		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}
}


























