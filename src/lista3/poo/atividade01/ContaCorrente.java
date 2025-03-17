package lista3.poo.atividade01;

public class ContaCorrente {
	long numero;
	String correntista;
	double saldo = 0.0;
	
	public void deposito(double valor) {
		if(valor < 0) {
			System.out.println("Erro: Impossível depositar um valor menor que zero.");
			return;
		}
		saldo += valor;
	}
	
	public void saque(double valor) {
		if(valor > saldo) {
			System.out.println("Erro: Impossível sacar um valor maior que o saldo da conta.");
			return;
		}
		
		saldo -= valor;
	}
}
