package TareaEnClaseBuilderRestaurante;

public class Lomito extends BuiderParrilla{

	@Override
	public void buildTipoDeCarne() {
		parrilla.setTipoDeCarne("lomo");
	}

	@Override
	public void buildSaborRefresco() {
		parrilla.setSaborRefresco("pepsi");
		
	}

	@Override
	public void buildGuarniciones() {
		parrilla.setGuarniciones("arroz");
		
	}

}
