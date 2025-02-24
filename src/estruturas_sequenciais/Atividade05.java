package estruturas_sequenciais;

import java.util.Scanner;

/*
 * Escreva um programa que calcule e mostre o consumo médio e a autonomia que um veículo ainda
 * teria antes de um abastecimento de combustível. Considere que o veículo sempre seja abastecido até 
 * encher o tanque e que são fornecidas apenas a capacidade do tanque, a quantidade de litros
 * abastecidos e a quilometragem percorrida desde o último abastecimento
 */

public class Atividade05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double consumoMedio, autonomia, capacidadeTanque, litrosAbastecidos, quilometragem;

		System.out.println("Insira a capacidade do tanque do veículo, em litros:");
		capacidadeTanque = s.nextDouble();

		System.out.println("Insira a quantidade de litros abastecidos:");
		litrosAbastecidos = s.nextDouble();

		System.out.println("Insira a quilometragem percorrida pelo veículo desde o último abastecimento:");
		quilometragem = s.nextDouble();

		s.close();

		double combustivelGasto = capacidadeTanque - litrosAbastecidos;

		// Cálculo da autonomia em Km/L
		autonomia = quilometragem / combustivelGasto;

		// Cálculo do consumo médio, em L/Km
		consumoMedio = combustivelGasto / quilometragem;

		System.out.printf("A autonomia do veículo é de %.1fKm/L\n", autonomia);
		System.out.printf("O consumo médio do veículo é de %.1fL/Km\n", consumoMedio);
	}
}
