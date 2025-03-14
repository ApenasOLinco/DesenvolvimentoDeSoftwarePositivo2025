package lista2.metodos;

/*
 * Escreva um método que retorne o maior valor entre três números inteiros.
 */
public class Atividade06 {
	public static void main(String[] args) {
		int maior = calculaMaior(2, 8, 100);
		
		System.out.println("Maior valor: " + maior);
	}

	public static int calculaMaior(int num1, int num2, int num3) {
		if(num1 >= num2 && num1 >= num3) {
			return num1;
		} else if(num2 >= num1 && num2 >= num3) {
			return num2;
		} else {
			return num3;
		}
	}
	
}
