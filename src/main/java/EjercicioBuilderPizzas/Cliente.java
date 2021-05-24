package EjercicioBuilderPizzas;

public class Cliente {

	public static void main(String[] args) {
		Restaurante elis = new Restaurante();
		Hawaina hawaiana = new Hawaina();
		Carnivora carnivora = new Carnivora();
		Clasica clasica = new Clasica();
		
		System.out.println("******************");
		
		elis.setBuilderPizza(hawaiana);
		elis.cocinarPizza();
		
		elis.getPizza().showData();
		
		System.out.println("******************");

		elis.setBuilderPizza(carnivora);
		elis.cocinarPizza();
		
		elis.getPizza().showData();
		
		System.out.println("******************");

		elis.setBuilderPizza(clasica);
		elis.cocinarPizza();
		
		elis.getPizza().showData();
	}

}
