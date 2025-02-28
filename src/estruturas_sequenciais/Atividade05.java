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
		double consumoMedio, autonomia, combustivelRestante, capacidadeTanque, litrosAbastecidos, quilometragem;

		System.out.println("Insira a capacidade do tanque:");
		capacidadeTanque = s.nextDouble();
		
		System.out.println("Insira a quantidade de litros abastecidos:");
		litrosAbastecidos = s.nextDouble();
		
		System.out.println("Insira a quilometragem percorrida desde o último abastecimento:");
		quilometragem = s.nextDouble();
		
		consumoMedio = quilometragem / litrosAbastecidos;
		combustivelRestante = capacidadeTanque - litrosAbastecidos;
		autonomia = combustivelRestante * consumoMedio;
		
		s.close();
		
		System.out.printf("O consumo médio do veículo é de %.1fKm/L\nA autonomia do veículo seria de %.1fKm\n", consumoMedio, autonomia);
	}
}
