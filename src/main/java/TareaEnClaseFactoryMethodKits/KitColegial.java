package TareaEnClaseFactoryMethodKits;

public class KitColegial implements IKit {

	Mochila mochila;
	Libros libros;
	Computadora computadora;

	public KitColegial() {
		mochila = new Mochila();
		libros = new Libros();
		computadora = new Computadora();

	}

	
	public Mochila getMochila() {
		return mochila;
	}


	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}


	public Libros getLibros() {
		return libros;
	}


	public void setLibros(Libros libros) {
		this.libros = libros;
	}


	public Computadora getComputadora() {
		return computadora;
	}


	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}


	@Override
	public void crear() {
		mochila.mostrarInfo();
		libros.mostrarInfo();
		computadora.mostrarInfo();
	}

}
