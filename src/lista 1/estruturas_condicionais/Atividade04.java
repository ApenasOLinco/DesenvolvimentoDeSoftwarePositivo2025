package estruturas_condicionais;

import java.util.Scanner;

/*
 * Escreva um programa que efetue a leitura de um número inteiro e apresente se esse número é 
 * divisível por 2 ou divisível por 7.
 */
public class Atividade04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("Insira um número inteiro:");
		num = s.nextInt();
		
		s.close();
		
		if(num % 2 == 0) {
			System.out.println("O número é divisível por 2.");
		} else if(num % 7 == 0) {
			System.out.println("O número é divisível por 7.");
		} else {
			System.out.println("O número não é divisível por 2 ou por 7.");
		}
	}
}
