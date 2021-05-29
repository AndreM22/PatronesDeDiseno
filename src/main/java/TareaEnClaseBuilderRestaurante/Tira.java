package TareaEnClaseBuilderRestaurante;

public class Tira extends BuiderParrilla{

	@Override
	public void buildTipoDeCarne() {
		parrilla.setTipoDeCarne(": tira de carne");
	}

	@Override
	public void buildSaborRefresco() {
		parrilla.setSaborRefresco("CocaCola");
		
	}

	@Override
	public void buildGuarniciones() {
		parrilla.setGuarniciones("fideo");
		
	}

}
