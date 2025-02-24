package main;

import java.util.Scanner;

/* 
 * Escreva um programa que pergunte ao usuário a quantidade de km percorridos por um carro alugado
 * e a quantidade de dias pelos quais ele foi alugado. Calcule e mostre o valor a pagar, sabendo que o
 * carro custa R$ 70,00 por dia e R$ 0,15 por km rodado
 */

public class Atividade04 {
	public static void main(String[] args) {
		double kmPercorridos, valorAPagar;
		int diasAlugado;
		Scanner s = new Scanner(System.in);

		System.out.println("Insira a quantidade de km percorridos pelo veículo: ");
		kmPercorridos = s.nextDouble();

		System.out.println("Insira a quantidade de dias que o carro foi alugado: ");
		diasAlugado = s.nextInt();

		valorAPagar = 70d * (double) diasAlugado + .15 * kmPercorridos;
		System.out.printf("Valor a pagar: R$%.2f", valorAPagar);

		s.close();
	}
}
