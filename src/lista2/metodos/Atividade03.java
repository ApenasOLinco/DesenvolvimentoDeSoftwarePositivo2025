package lista2.metodos;

/*
 * Escreva um método que calcule e retorne o valor da conta de energia a ser paga
 * de acordo com a quantidade de kW consumidos, sendo que o valor do kW é 0,60
 * (pessoa física), 0,48 (comércio) e 1,29 (indústria).
 */
public class Atividade03 {
	
	public static void main(String[] args) {
		
		double kwConsumidos = 200;
		calculaConta(kwConsumidos, 0);
		
	}
	
	public static void calculaConta(double kwConsumidos, int tipo) {
		double valorPorTipo[] = {
			// Pessoa física
			.60,
			// Comércio
			.40,
			// Indústria			
			1.29		
		};
		
		double resultado = kwConsumidos * valorPorTipo[tipo];
		System.out.printf("Valor a ser pago: R$%.2f", resultado);
	}

}
