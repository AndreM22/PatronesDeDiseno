package EjercicioAbstractFactory;


public class FactoryHelado {
	static IHelado heladoAgua = new HeladoAgua();
	static IHelado heladoCrema = new HeladoCrema();
	static IHelado heladoMixto = new HeladoMixto();

	enum Helados {
		HeladoAgua, HeladoCrema, HeladoMixto
	}

	public static IHelado make(Helados p) {
		Base baseCono = new Base();
		Fruta fruta = new Fruta();
		Crema crema = new Crema();

		switch (p) {

		case HeladoAgua:
			baseCono.setCosto("5");
			baseCono.setNombre("cono");
			baseCono.setTamano("grande");
			baseCono.setTipo("galleta");

			fruta.setCosto("1");
			fruta.setNombre("frutilla");
			fruta.setTamano("mediano");
			fruta.setTipoFruta("dulces");

			((HeladoAgua) heladoAgua).setBase(baseCono);
			((HeladoAgua) heladoAgua).setForma("clasica");
			((HeladoAgua) heladoAgua).setFruta(fruta);
			((HeladoAgua) heladoAgua).setTamano("mediano");

			return heladoAgua;

		case HeladoCrema:
			baseCono.setCosto("5");
			baseCono.setNombre("cono");
			baseCono.setTamano("grande");
			baseCono.setTipo("galleta");

			fruta.setCosto("1");
			fruta.setNombre("frutilla");
			fruta.setTamano("mediano");
			fruta.setTipoFruta("dulces");

			crema.setSabor("naranja");
			crema.setMarca("PIL");
			crema.setCosto("1");

			((HeladoCrema) heladoCrema).setBase(baseCono);
			((HeladoCrema) heladoCrema).setForma("clasica");
			((HeladoCrema) heladoCrema).setFruta(fruta);
			((HeladoCrema) heladoCrema).setTamano("mediano");
			((HeladoCrema) heladoCrema).setCrema(crema);
			return heladoCrema;

		case HeladoMixto:
			
	        baseCono.setCosto("6");
	        baseCono.setNombre("vaso");
	        baseCono.setTamano("mediano");
	        baseCono.setTipo("plastico");
	        
	        fruta.setCosto("1");
	        fruta.setNombre("chirimolla");
	        fruta.setTamano("mediano");
	        fruta.setTipoFruta("acido");
	        
	        crema.setSabor("vainilla");
	        crema.setMarca("PIL");
	        crema.setCosto("1");
	        
	        ((HeladoMixto) heladoMixto).setBase(baseCono);
	        ((HeladoMixto) heladoMixto).setForma("standart");
	        ((HeladoMixto) heladoMixto).setFruta(fruta);
	        ((HeladoMixto) heladoMixto).setTamano("mediano");
	        ((HeladoMixto) heladoMixto).setCrema(crema);
	        ((HeladoMixto) heladoMixto).setCosto("50");
			return heladoMixto;

		}
		return null;
	}
}
