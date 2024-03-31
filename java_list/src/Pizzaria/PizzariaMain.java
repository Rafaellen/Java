package Pizzaria;
import java.util.ArrayList;

public class PizzariaMain {
	public static void main(String[] args) {
		PizzariaClass calabresa = new PizzariaClass("Calabresa", 28.50, new ArrayList<>());
		PizzariaClass mussarela = new PizzariaClass("Mussarela", 25.00, new ArrayList<>());
		PizzariaClass frango = new PizzariaClass("Frango", 30.00, new ArrayList<>());

		calabresa.getIngredientes().add("Molho de tomate");
		calabresa.getIngredientes().add("Muçarela");
		calabresa.getIngredientes().add("Calabresa");
		
		mussarela.getIngredientes().add("Molho de tomate");
		mussarela.getIngredientes().add("Muçarela");
		mussarela.getIngredientes().add("Oregano");

		
		frango.getIngredientes().add("Molho de tomate");
		frango.getIngredientes().add("Muçarela");
		frango.getIngredientes().add("Calabresa");


		OrderClass pedido = new OrderClass();
		pedido.addPizza(calabresa);
		pedido.addPizza(mussarela);
		pedido.addPizza(frango);
		
				
		System.out.println("Pedido realizado:");
		    for (PizzariaClass pizza : pedido.getPizzas()) {
		        System.out.println(pizza);
		    }
		    System.out.println("Valor total: R$" + pedido.calcularTotal());
	}
}
