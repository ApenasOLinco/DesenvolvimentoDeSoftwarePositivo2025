package estruturas_condicionais;

import java.util.Scanner;

/*
 * Escreva um programa que efetue a leitura de um número inteiro e apresente se esse número é 
 * divisível por 2 e divisível por 3
 */
public class Atividade03 {
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("insira um número:");
		num = s.nextInt();
		
		s.close();
				
		if(num % 2 == 0 && num % 3 == 0) {
			System.out.println("O número é divisível por 2 e por 3.");
		} else {
			System.out.println("O número não é divisível por 2 e por 3.");
		}
	}
}
