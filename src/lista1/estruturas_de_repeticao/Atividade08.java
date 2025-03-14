package lista1.estruturas_de_repeticao;

import java.util.Locale;
import java.util.Scanner;

/*
 * A definição de "amplitude" em Estatística é dada pela grandeza numérica resultante da diferença
 * entre o maior valor e o menor valor do conjunto de valores de uma amostra. Escreva programa que
 * leia uma sequencia de números reais positivos terminada em zero (o número zero não deve ser
 * processado pois serve para marcar o final da entrada de dados). O programa deve determinar e
 * mostrar o valor da amplitude estatística dos valores. Exemplo: para a sequencia 4.5, 5.2, 1.7, 1.3, 1.9,
 * 2.2, 8.3, 9.1, 5.4 e 0, teremos o resultado de 7.8 como amplitude.
 */
public class Atividade08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.ENGLISH);
		
		float maior = 0, menor = Float.MAX_VALUE, lido;
		
		System.out.println("Insira uma sequência de números reais (0 para parar):");
		
		do {
			lido = scanner.nextFloat();
			
			if(lido == 0) break;
			if(lido > maior) maior = lido;
			if(lido < menor) menor = lido;
		} while(true);
		
		scanner.close();
		
		System.out.println("Amplitude: " + (maior - menor));
	}
}





















