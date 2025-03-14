package lista1.estruturas_sequenciais;

/* 
 * Uma fabrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e 
 * garrafa de 2 litros. Tomando por base que um comerciante compre uma determinada quantidade de 
 * cada um dos formatos disponíveis, escreva um programa para calcular quantos litros de refrigerante 
 * ele comprou
 */

import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {
		float latas350Ml, garrafas600Ml, garrafas2L;
		float litros;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira o número de latas de 350ml compradas: ");
		latas350Ml = scanner.nextInt();

		System.out.println("Insira o número de garrafas de 600ml compradas: ");
		garrafas600Ml = scanner.nextInt();

		System.out.println("Insira o número de garrafas de 2L compradas: ");
		garrafas2L = scanner.nextInt();

		litros = latas350Ml * .35f + garrafas600Ml * .6f + garrafas2L * 2f;

		scanner.close();

		System.out.println("Litros comprados: " + litros);
	}
}
