package estruturas_de_repeticao;

/*
 * Escreva um programa que escreva os 10 primeiros números da sequência de Fibonacci (1, 1, 2, 3, 5, 8, 
 * 13, 21, 34, 55).
 */
public class Atividade06 {
	public static void main(String[] args) {
		int current = 1, ante1 = 0, ante2 = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println(current);
			
			ante2 = ante1;
			ante1 = current;
			
			current = ante1 + ante2;
		}
	}
}
