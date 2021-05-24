package EjercicioBuilderPizzas;

public class Carnivora extends BuilderPizza{

	@Override
	public void buildIngredientes() {
		pizza.setIngredientes("carne, salsa tomate, otro");
	}

	@Override
	public void buildTipoMasa() {
		pizza.setTipoMasa("masa especial");
	}

	@Override
	public void buildTipoQueso() {
		pizza.setTipoQueso("quezo mozarella");
	}

}
