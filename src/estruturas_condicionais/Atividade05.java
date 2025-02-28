package estruturas_condicionais;

import java.util.Scanner;

/*
 * Em uma certa papelaria, até 100 folhas, a cópia do xerox custa R$ 0,25 e, acima de 100 folhas, cada
 * cópia adicional custa R$ 0,20. Escreva um programa que dado o número total de cópias, informe o 
 * valor a ser pago
 */
public class Atividade05 {
	public static void main(String[] args) {
		int copias;
		float pagtoTotal = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de cópias Xerox.");
		copias = s.nextInt();
		
		s.close();
		
		float valorPorFolha = .25f;
		for (int i = 1; i <= copias; i++) {
			if(i > 100) valorPorFolha = .20f;
			
			pagtoTotal += valorPorFolha;
		}
		
		System.out.printf("Valor total: R$%.2f.", pagtoTotal);
	}
}
