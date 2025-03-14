package lista2.metodos;

/*
 * Uma escola remunera seus professores por hora/aula ministrada. Escreva um método que calcule
 * e retorne o salário de um professor, sendo que o valor hora/aula obedece aos seguintes critérios:
 * 20,00 para o nível 1, 25,00 para o nível 2 e 30,00 para o nível 3.
 */
public class Atividade02 {
	
	public static void main(String[] args) {
		int nivel = 3;
		double horas = 120.0;
		calculaSalario(nivel, horas);
	}
	
	public static void calculaSalario(int nivel, double horas) {
		
		double salarioPorNivel[] = { 20, 25, 30 };
		
		double resultado = salarioPorNivel[nivel - 1] * horas;
		System.out.printf("O salário do professor é de R$%.2f", resultado);
		
	}
	
}
