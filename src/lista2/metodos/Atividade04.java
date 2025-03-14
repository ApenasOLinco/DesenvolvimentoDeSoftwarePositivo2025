package lista2.metodos;

import java.util.Scanner;

/*
 * Escreva um método que solicite ao usuário o nome de um produto, o preço desse produto e o
 * valor em dinheiro entregue ao vendedor. Em seguida, deve ser mostrada uma mensagem baseada
 * no seguinte exemplo: "Você comprou um produto (mouse) por R$ 185,00 e entregou ao vendedor
 * R$ 200,00 em dinheiro. Você vai receber R$ 15,00 de troco. Volte sempre!".
 */
public class Atividade04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira, respectivamente, o nome do produto, o preço e o valor pago, separados por enter:");
		
		String nomeProduto = s.nextLine();
		double preco = s.nextDouble();
		double valorPago = s.nextDouble();
		
		s.close();
		
		mostraTroco(nomeProduto, preco, valorPago);
	}

	public static void mostraTroco(String nomeProduto, double preco, double pago) {
		double troco = pago - preco;

		System.out.printf(
				"Você comprou o produto \"%s\" por R$%.2f e entregou ao vendedor R$%.2f em dinheiro. Você vai receber R$%.2f de troco. Volte sempre!",
				nomeProduto,
				preco,
				pago,
				troco
		);

	}

}
