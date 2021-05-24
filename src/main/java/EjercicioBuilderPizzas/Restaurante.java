package EjercicioBuilderPizzas;


public class Restaurante {
	private BuilderPizza builderPizza;
    public void setBuilderPizza(BuilderPizza builderPizza){
        this.builderPizza=builderPizza;
    }
    
    public Pizza getPizza(){
        return builderPizza.getPizza();
    }
    
    public void cocinarPizza() {
    	this.builderPizza.createPizza();
    	this.builderPizza.buildIngredientes();
    	this.builderPizza.buildTipoMasa();
    	this.builderPizza.buildTipoQueso();
    }
}
