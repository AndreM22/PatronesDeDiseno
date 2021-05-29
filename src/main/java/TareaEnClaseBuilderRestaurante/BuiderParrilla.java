package TareaEnClaseBuilderRestaurante;


public abstract class BuiderParrilla {
	protected Parrilla parrilla;

	public Parrilla getParrilla() {
		return parrilla;
	}

	public void createParrilla() {
		parrilla = new Parrilla();
	}
	
    public abstract void buildTipoDeCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();
}
