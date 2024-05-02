package Carro;

public class CarroClass {
	String marca;
	String modelo;
	int ano;
	double vel_atual;
	
	public CarroClass(String brand, String model, int year, double current_speed) {
		this.marca = brand;
		this.modelo = model;
		this.ano = year;
		this.vel_atual = current_speed;
	}
	
	public void acelerar(double acelerar) {
		if (vel_atual < 0) {
			System.out.println("Velocidade inválida.");
		} else {
			vel_atual += acelerar;
			System.out.println("Velocidade após acelerar: " + vel_atual);
		}
	}
	
	public void frear(double freiar) {
		if (vel_atual < 0) {
			System.out.println("Velocidade inválida.");
		} else {
			vel_atual -= freiar;
			System.out.println("Velocidade após freiar: " + vel_atual);
		}
	}
	
	public void infoCarro() {
		System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nVelocidade atual: " + vel_atual);
	}
	
}
