package lista1.estruturas_condicionais;

import java.util.Scanner;

/*
 * Escreva um programa que leia dois números inteiros e os apresente em ordem crescente.
 */

public class Atividade01 {

	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		a = scanner.nextInt();
		
		System.out.println("Insira o segundo número: ");
		b = scanner.nextInt();
		
		scanner.close();
		
		if(a < b) {
			System.out.println(a + ", " + b);
		} else {
			System.out.println(b + ", " + a);
		}
	}

}
