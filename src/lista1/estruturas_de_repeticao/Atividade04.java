package lista1.estruturas_de_repeticao;

import java.util.Scanner;

/*
 * Escreva um programa que some os números fornecidos pelo usuário até que o número lido seja igual 
 * a zero. Ao final, mostre o resultado da soma.
 */
public class Atividade04 {
	
	public static void main(String[] args) {
		int soma = 0, lido;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Insira um número para somar (0 = Parar): ");
			lido = scanner.nextInt();
			
			soma += lido;
		} while (lido != 0);
		
		scanner.close();
		System.out.printf("Soma total: %d\n", soma);
	}
}
