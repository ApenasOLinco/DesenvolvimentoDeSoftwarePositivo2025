package estruturas_condicionais;

import java.util.Scanner;

/*
 * Escreva um programa que converta números inteiros, de sua representação numérica para 
 * representação em extenso. O programa deverá solicitar ao usuário um número inteiro (de 0 a 9) e 
 * mostrar na tela o valor em extenso. Por exemplo, se o usuário digitar "7", o programa deverá mostrar 
 * "Sete". Se o usuário digitar um valor fora da faixa prevista (de 0 a 9), o programa deverá mostrar 
 * "Valor inválido!".
 */
public class Atividade06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		short num;
		String extenso[] = { "Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove" };
		
		System.out.println("Insira um número inteiro de 0 a 9:");
		num = s.nextShort();
		
		s.close();
		
		if(num >= 0 && num < extenso.length) {
			System.out.println(extenso[num]);
		} else {
			System.out.println("Valor inválido!");
		}
	}
}
