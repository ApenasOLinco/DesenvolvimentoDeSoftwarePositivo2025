package estruturas_de_repeticao;

import java.util.Scanner;

/*
 * Escreva um programa que mostre todos os números pares existentes entre 1 e um número lido do 
 * teclado, bem como a quantidade de números apresentados
 */
public class Atividade03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("Insira um número inteiro:");
		num = s.nextInt();
		
		s.close();
		
		System.out.println("Numeros pares:");
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) System.out.print(i + (i == num ? "." : ", "));
		}
	}
}
