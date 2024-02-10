import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Pizza {

	public static HashMap<String, Integer> TodosIngredientes = new HashMap<>();
	List<String> Ingredientes = new ArrayList<>();
	int Preco;
	
	public void AdicionaIngrediente(String ingrediente){
		boolean existeIngrediente = Ingredientes.contains(ingrediente);
		if(existeIngrediente == false){
			Ingredientes.add(ingrediente);
			Pizza.ContabilizaIngrediente(ingrediente);	
		}
	}
	
	public int getPreco(){
		int quantidadeIngredientes = Ingredientes.size();
		
		if(quantidadeIngredientes <= 2){
			return 15;
		}else if(quantidadeIngredientes <= 5) {
			return 20;
		}else{
			return 23;
		}
	}
	
	public static void ContabilizaIngrediente(String ingrediente) {
		int quantidade = TodosIngredientes.getOrDefault(ingrediente, 0) + 1;
		TodosIngredientes.put(ingrediente, quantidade);
	}
	
}


