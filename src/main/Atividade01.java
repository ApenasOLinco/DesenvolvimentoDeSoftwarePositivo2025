package main;

/*
Escreva um programa que leia horas, minutos e segundos do teclado e apresente o tempo total em
segundos
 */

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        int horas, minutos, segundos;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantidade de horas: ");
        horas = scanner.nextInt();

        System.out.print("Insira a quantidade de minutos: ");
        minutos = scanner.nextInt();

        System.out.print("Insira a quantidade de segundos: ");
        segundos = scanner.nextInt();
        scanner.close();

        System.out.println(horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s).");

        segundos += minutos * 60 + horas * 3600;
        System.out.println("Total, em segundos: " + segundos);
    }
}
