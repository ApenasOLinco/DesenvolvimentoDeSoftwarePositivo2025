package lista2.metodos;

/*
 * Escreva um método que receba o nome e as 3 notas de um aluno e mostre o nome do aluno e a sua média aritmética
 */
public class Atividade01 {
	
	public static void main(String[] args) {
		double nota1 = 10, nota2 = 7, nota3 = 7.5;
		
		mostraMedia(nota1, nota2, nota3);
	}
	
	private static void mostraMedia(double nota1, double nota2, double nota3) {
		
		double resultado = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("Média Aritmética das notas: %.1f", resultado);
		
	}
	
}
