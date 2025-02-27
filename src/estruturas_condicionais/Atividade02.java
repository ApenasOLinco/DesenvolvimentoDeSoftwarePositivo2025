package estruturas_condicionais;

import java.util.Scanner;

/*
 * Escreva um programa que leia três números inteiros e apresente na tela o menor valor
 */

public class Atividade02 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número");
		a = scanner.nextInt();
		
		System.out.println("Insira o segundo número");
		b = scanner.nextInt();
		
		System.out.println("Insira o terceiro número");
		c = scanner.nextInt();
		
		scanner.close();
		
		System.out.print("Menor valor: ");
		
		if(a < b && a < c) {
			System.out.println(a);
		} else if (b < a && b < c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
}
