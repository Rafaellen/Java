package Pizzaria;
import java.util.ArrayList;

public class OrderClass {
	private ArrayList<PizzariaClass> pizzas;
	
	public OrderClass() {
		this.pizzas = new ArrayList<>();
	}
	
	public void addPizza(PizzariaClass pizza) {
		pizzas.add(pizza);
	}
	
	public void cancelOrder() {
		pizzas.clear();
	}
	
	public double calcularTotal() {
		double total = 0;
		for (PizzariaClass pizza : pizzas) {
			total += pizza.getValor();
		}
		return total;
	}
	
	public ArrayList<PizzariaClass> getPizzas() {
        return pizzas;
	}

}
