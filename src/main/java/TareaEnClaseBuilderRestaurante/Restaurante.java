package TareaEnClaseBuilderRestaurante;


public class Restaurante {
	private BuiderParrilla builderParrilla;
    public void setBuilderParrilla(BuiderParrilla builderParrilla){
        this.builderParrilla=builderParrilla;
    }
    
    public Parrilla getParrilla(){
        return builderParrilla.getParrilla();
    }
    
    public void cocinarParrilla() {
    	this.builderParrilla.createParrilla();
    	this.builderParrilla.buildTipoDeCarne();
    	this.builderParrilla.buildSaborRefresco();
    	this.builderParrilla.buildGuarniciones();
    }
}
