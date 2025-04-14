package datas_e_horas.atividade01;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/*
    Em um estacionamento localizado no centro da cidade, para a primeira hora &eacute; cobrado o valor de R$ 5,00 e o valor de R$ 2,00 a cada 15 minutos extras.

    Escreva um programa que dado o horário de entrada e de saída de um veículo no estacionamento apresente o seguinte recibo:

    -----------------------------
    Recibo
    -----------------------------
    Placa: AAA-1111
    Entrada: 18:20
    Saida: 19:35
    Tempo total (em minutos): 75
    Total a pagar: R$ 7.00
    -----------------------------
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String horaEntrada, horaSaida;

        Carro fusquinha = new Carro("AAA-2412");
        Recibo recibo;

        System.out.println("Insira o horário de entrada do veículo: ");
        horaEntrada = s.nextLine();

        System.out.println("Insira o horário de saída do veículo: ");
        horaSaida = s.nextLine();

        try {
            recibo = new Recibo(
                    fusquinha,
                    LocalTime.parse(horaEntrada),
                    LocalTime.parse(horaSaida)
            );

            System.out.println(recibo);
        } catch (DateTimeParseException ex) {
            System.err.println("Alguma das datas inseridas está em um formato incorreto. Tente novamente.");
            System.exit(1);
        }
    }
}