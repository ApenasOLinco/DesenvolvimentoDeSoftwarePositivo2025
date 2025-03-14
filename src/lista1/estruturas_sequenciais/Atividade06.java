package lista1.estruturas_sequenciais;

import java.util.Scanner;

/*
 * Escreva um programa que solicite do usuário o valor de um saque em caixa eletrônico, sendo que 
 * estarão disponíveis cédulas de 5, 10, 20, 50 e 100. O programa deve apresentar a menor quantidade 
 * de cédulas possível de acordo com o saque. Exemplos:
 * 		400,00: 4 cédulas de 100, 0 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5. 
 * 		350,00: 3 cédulas de 100, 1 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5.
 * 		385,00: 3 cédulas de 100, 1 cédula de 50, 1 cédula de 20, 1 cédula de 10 e 1 cédula de 5.
 */

public class Atividade06 {
	public static void main(String[] args) {
		double valorSaque;
		int cedulasDisponiveis[] = { 100, 50, 20, 10, 5 };
		int cedulasSaque[] = new int[5];

		Scanner s = new Scanner(System.in);

		System.out.print("Insira o valor do saque:");
		valorSaque = s.nextDouble();

		s.close();

		double restante = valorSaque;
		for (int i = 0; i < cedulasDisponiveis.length;) {
			if (cedulasDisponiveis[i] <= restante) {
				restante -= cedulasDisponiveis[i];
				cedulasSaque[i]++; // Aumenta o número de cédulas desse tipo para sacar
			} else {
				i++;
			}
		}

		// Imprimir resultado
		for (int i = 0; i < cedulasSaque.length; i++) {
			int valorCedula = cedulasDisponiveis[i];
			int quantidade = cedulasSaque[i];

			if (i == cedulasSaque.length - 1) {
				System.out.print(" e ");
			}

			System.out.printf("%d %s de %d", quantidade, quantidade <= 1 ? "cédula" : "cédulas", valorCedula);

			if (i == cedulasSaque.length - 1) {
				System.out.print(".");
			} else if (i < cedulasSaque.length - 2) {
				System.out.print(", ");
			}
		}

		System.out.println();
	}
}
