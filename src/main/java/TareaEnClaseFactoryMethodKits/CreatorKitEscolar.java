package TareaEnClaseFactoryMethodKits;

public class CreatorKitEscolar extends CreatorKit {

	@Override
	public IKit create() {
		Mochila mochila = new Mochila();
		mochila.setNumeroBolsillos(4);
		mochila.setTamano("Mediano");

		Deportivo deportivo = new Deportivo();
		deportivo.setColor("naranja");
		deportivo.setTalla("M");
		deportivo.setNumeroDePrendas(3);

		Cuaderno cuaderno = new Cuaderno();
		cuaderno.setNumeroDeHojas(150);
		cuaderno.setTipo("Espiral");
		
		KitEscolar kit = new KitEscolar();
		kit.setCuaderno(cuaderno);
		kit.setDeportivo(deportivo);
		kit.setMochila(mochila);
		return kit;
	}

}
