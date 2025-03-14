package lista1.estruturas_de_repeticao;

/*
 * Escreva um programa que mostre o resultado da série: 1/100 + 2/99 + 3/98 + 4/97 + ... + 100/1.
 */
public class Atividade07 {
	public static void main(String[] args) {
		float num = 1, den = 100;
		
		while(num <= 100 && den >= 1) {
			System.out.println(num/den);
			
			num++;
			den--;
		}
	}
}
