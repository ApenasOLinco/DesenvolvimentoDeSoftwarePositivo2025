package main;

import java.util.Scanner;

/*
Escreva um programa que leia um número inteiro e apresente o seu antecessor e o seu sucessor
 */
public class Atividade02 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero inteiro:");
        num = scanner.nextInt();

        System.out.printf("Antecessor: %d, Sucessor: %d", num - 1, num + 1);
    }
}
