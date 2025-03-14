package lista1.estruturas_condicionais;

import java.util.Scanner;

/*
 * Escreva um programa que leia três números inteiros e apresente na tela o menor valor
 */

public class Atividade02 {
	public static void main(String[] args) {
		int num, menor;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número");
		menor = scanner.nextInt();
		
		System.out.println("Insira o segundo número");
		num = scanner.nextInt();
		
		if(num < menor) menor = num;
		
		System.out.println("Insira o terceiro número");
		num = scanner.nextInt();
		
		if(num < menor) menor = num;
		
		scanner.close();
		
		System.out.print("Menor valor: " + menor);
	}
}
