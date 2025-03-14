package lista1.estruturas_de_repeticao;

/*
 * Escreva um programa que mostre na tela a soma obtida dos 100 primeiros números inteiros (1 + 2 + 3 
 * + 4 + 5 + ... + 100).
 */

public class Atividade02 {
	public static void main(String[] args) {
		int soma = 0;
		
		for (int i = 1; i <= 100; i++) {
			soma += i;
		}
		
		System.out.println(soma);
	}
}
