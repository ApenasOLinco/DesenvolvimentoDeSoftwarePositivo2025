package lista3.poo.atividade01;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente();
		String operacao = "x";
		Scanner scanner = new Scanner(System.in);
		
		// Faz com que o scanner use "." ao invés de "," como separador de casas decimais na hora de ler um input
		scanner.useLocale(Locale.ENGLISH);

		System.out.println("APP DE BANCO");
		
		// Criar informações da conta corrente
		System.out.println("Insira o nome do correntista da conta: ");
		contaCorrente.correntista = scanner.next();
		
		// Valor aleatório de 0 a 99999 para o número da conta
		contaCorrente.numero = (long) (Math.random() * 100000);
		
		// Loop da aplicação
		do {
			System.out.println("=================================");
			System.out.printf("Nome do correntista: %s\n", contaCorrente.correntista);
			System.out.printf("Número da conta: %d\n", contaCorrente.numero);
			System.out.printf("Saldo atual: R$%.2f\n\n", contaCorrente.saldo);
			System.out.println("Operações:");
			System.out.println("(S)aque: \"s\";");
			System.out.println("(D)epósito: \"d\";");
			System.out.println("Sair: \"x\".");
			System.out.print("Insira a operação que deseja realizar: ");
			operacao = scanner.next();

			switch (operacao) {
			case "S", "s": // Maiúsculas e minúsculas
				double valorSaque;
				System.out.println("Insira o valor a sacar: ");
				valorSaque = scanner.nextDouble();
				contaCorrente.saque(valorSaque);
				break;
				
			case "D", "d": // Maiúsculas e minúsculas
				double valorDeposito;
				System.out.println("Insira o valor para depositar: ");
				valorDeposito = scanner.nextDouble();
				contaCorrente.deposito(valorDeposito);
				break;
			}
		} while (!operacao.equalsIgnoreCase("x")); // Verifica se a operação inserida é a de sair. "equaisIgnoreCase"
													// ignora se a letra é maiúscula ou minúscula.
		
		// Sair da aplicação
		scanner.close();
		System.out.println("Saindo da aplicação...");
		System.out.println("Agradecemos a preferência!");
	}

}





























