package estruturas_de_repeticao;

import java.util.Scanner;

/*
 *  Escreva um programa que apresente na tela a tabuada de um número lido do teclado. Por exemplo,
 *  considerando que o número lido é 2, o formato da apresentação deve ser o seguinte:
 *     2 x 1 = 2
 *	   2 x 2 = 4
 *	   2 x 3 = 6
 *	   2 x 4 = 8
 *	   2 x 5 = 10
 *	   2 x 6 = 12
 *	   2 x 7 = 14
 *	   2 x 8 = 16
 *	   2 x 9 = 18
 *	   2 x 10 = 20
 */
public class Atividade05 {
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o número:");
		num = s.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
		}
		
		s.close();
	}
}


















