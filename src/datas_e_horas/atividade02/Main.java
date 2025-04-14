package datas_e_horas.atividade02;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*  Escreva um programa para calcular o número total de horas trabalhadas com base nos horários de entrada
    e saída de um funcionário. Além de calcular o total de horas trabalhadas, o programa deve considerar uma
    jornada de trabalho padrão de 8 horas e verificar se o funcionário fez horas extras.

    Nome: João Pedro
    Entrada: 08:07
    Saída: 16:41
    Horas trabalhadas: 8 horas e 34 minutos
    Horas extras: Sim
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeFuncionario;
        LocalTime entrada, saida;
        Duration tempoTrabalhado;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Insira o nome do funcionário:");
        nomeFuncionario = scanner.nextLine();

        System.out.println("Insira o horário de entrada do funcionário");
        entrada = LocalTime.parse(scanner.nextLine());

        System.out.println("Insira o horário de saída do funcionário");
        saida = LocalTime.parse(scanner.nextLine());

        tempoTrabalhado = Duration.between(entrada, saida);

        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Entrada: " + entrada.format(formatter));
        System.out.println("Saída: " + saida.format(formatter));
        System.out.printf(
                "Tempo trabalhado: %d horas e %d minutos\n",
                tempoTrabalhado.toHoursPart(),
                tempoTrabalhado.toMinutesPart()
        );
        System.out.printf("Horas Extras: %s\n", tempoTrabalhado.toHoursPart() > 8 ? "Sim" : "Não");
    }
}
