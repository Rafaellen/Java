package Pizzaria;

import java.util.ArrayList;

public class PizzariaClass {
	String nome;
	double valor;
	ArrayList<String> ingredientes; 
	
	public PizzariaClass(String nome, double valor, ArrayList<String> ingredientes) {
		this.nome = nome;
		this.valor = valor;
		this.ingredientes = ingredientes;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}
	
	
	@Override
	public String toString() {
		return nome + "| R$ " + valor;
	}

}
