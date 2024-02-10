import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {

	List<Pizza> Pizzas = new ArrayList<>();
		
	public void AdicionarPizza(Pizza pizza){
		if(pizza.Ingredientes.size() > 0) {
			Pizzas.add(pizza);
		}
	}
	
	public int ValorTotal(){
		int somadorTotal = 0;
		for(Pizza pizza : Pizzas) {
			somadorTotal += pizza.getPreco();
		}
		return somadorTotal;
	}
		
}
