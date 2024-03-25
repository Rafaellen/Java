package ContaBancaria;

public class ContaBancariaClass {
	private String numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancariaClass(String numConta, String nomeTitular, double saldo) {
		this.numeroConta = numConta;
		this.nomeTitular = nomeTitular; 
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			
			System.out.println("O valor de " + valor + " foi depositado com sucesso!");
		} else {
			System.out.println("Valor do depósito inválido");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			
			System.out.println("Valor de " + valor + " foi sacado com sucesso!");
		} else {
			System.out.println("Valor de saque inválido!");
		}
	}
	
	public double obterSaldo() {
		return saldo;
	}
	
}
