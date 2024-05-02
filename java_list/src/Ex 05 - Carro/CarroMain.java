package Carro;

public class CarroMain {
	public static void main(String[] args) {
		CarroClass c1 = new CarroClass("Volkswagen ", "Fusca", 1987, 75.0);
		
		c1.infoCarro();
		c1.acelerar(100.0);
		c1.frear(50.0);
		
	}
}
