import javax.swing.JOptionPane;

public class UsuarioFinal {

	public static void main(String[] args) {
		
		CarrinhoCompra carrinho = new CarrinhoCompra();
		
		int opcao;
		String entra;
		
		do {
			entra = JOptionPane.showInputDialog("VOCE QUER UMA PIZZA? \n\n (Digite 1 se sim e 2 se nao)");
			opcao = Integer.parseInt(entra);
			
			if(opcao == 1) {
				Pizza pizza =  new Pizza();
				
				do {
					entra = JOptionPane.showInputDialog("SELECIONE O SABOR DESEJADO \n\n\t1.Calabresa \n\t2.Peperonni \n\t3.Alho e oleo \n\t4.Bacon \n\t5.Milho \n\t6.Chocolate \n\t99.SAIR");
					opcao = Integer.parseInt(entra);
						switch(opcao) {
							case 1: {
									pizza.AdicionaIngrediente("Calabresa");
								break;
							}
							
							case 2: {
								pizza.AdicionaIngrediente("Peperonni");
								break;
							}
							
							case 3: {
								pizza.AdicionaIngrediente("Alho e olho");
								break;
							}
							
							case 4: {
								pizza.AdicionaIngrediente("Bacon");
								break;
							}
							
							case 5: {
								pizza.AdicionaIngrediente("Milho");
								break;
							}
							
							case 6: {
								pizza.AdicionaIngrediente("Chocolate");
								break;
							}
						
							case 99: {
								break;
							}
						
							default:System.out.println("OPCAO INVALIDA");
						}
						
					}while(opcao != 99);
				
				carrinho.AdicionarPizza(pizza);
				pizza.getPreco();
					
			}else {
				System.out.println("Muito obrigado pela visita!");
			}
		
		}while(opcao != 2);
		
		System.out.println(Pizza.TodosIngredientes);
		System.out.println(carrinho.ValorTotal());
			
	}
		
}


