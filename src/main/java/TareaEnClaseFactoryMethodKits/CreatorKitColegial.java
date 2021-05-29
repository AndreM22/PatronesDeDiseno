package TareaEnClaseFactoryMethodKits;

public class CreatorKitColegial extends CreatorKit{

	@Override
	public IKit create() {
		Mochila mochila = new Mochila();
		mochila.setNumeroBolsillos(6);
		mochila.setTamano("Grande");

		Libros libros = new Libros();
		libros.setAutor("George Martin");
		libros.setTipo("Fantasia");
		
		Computadora computadora = new Computadora();
		computadora.setMarca("HP");
		computadora.setSistemaOperativo("Windows");
		
		KitColegial kit = new KitColegial();
		kit.setLibros(libros);
		kit.setComputadora(computadora);
		kit.setMochila(mochila);
		return kit;
	}
	

}
