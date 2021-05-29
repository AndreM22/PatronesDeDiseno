package TareaEnClaseBuilderRestaurante;

public class Bife extends BuiderParrilla{

	@Override
	public void buildTipoDeCarne() {
		parrilla.setTipoDeCarne("bife");
	}

	@Override
	public void buildSaborRefresco() {
		parrilla.setSaborRefresco("CocaCola");
		
	}

	@Override
	public void buildGuarniciones() {
		parrilla.setGuarniciones("papasFritas");
		
	}

}
