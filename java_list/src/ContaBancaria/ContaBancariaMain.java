package ContaBancaria;

public class ContaBancariaMain {
	public static void main(String[] args) {
		ContaBancariaClass c1 = new ContaBancariaClass("123456", "Jubileu", 100.0);
		c1.depositar(200.0);
		c1.sacar(100.0);
		
		System.out.println("-- Saldo: " + c1.obterSaldo());
	}
}
