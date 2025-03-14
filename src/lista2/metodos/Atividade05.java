package lista2.metodos;

import java.util.Scanner;

/*
 * Escreva um método que solicite ao usuário o nome e o preço de um produto.
 * Em seguida, deve ser mostrada uma mensagem baseada no seguinte exemplo: 
 * "Você comprou um produto (mouse) por R$ 185,00 e acaba de ganhar um desconto de 10%. 
 * Assim você vai pagar apenas R$ 166,50 pelo seu produto. Volte sempre!".
 */
public class Atividade05 {

	public static void main(String[] args) {
		String nomeProduto;
		double preco, descontoPorcentagem = 10.0;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Insira o nome do produto: ");
		nomeProduto = s.nextLine();

		System.out.println("Insira o preço do produto: ");
		preco = s.nextDouble();

		s.close();
		
		calculaDesconto(nomeProduto, preco, descontoPorcentagem);
	}

	public static void calculaDesconto(String nomeProduto, double preco, double descontoPorcentagem) {
		double valorFinal;

		valorFinal = preco - preco * descontoPorcentagem / 100;

		System.out.printf(
				"Você comprou um produto (%s) por R$ %.2f e acaba de ganhar um desconto de %.1f%%.\n"
						+ "Assim, você vai pagar apenas R$ %.2f pelo seu produto. Volte sempre!",
				nomeProduto, preco, descontoPorcentagem, valorFinal);

	}

}
