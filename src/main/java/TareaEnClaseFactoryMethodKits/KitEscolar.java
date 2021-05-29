package TareaEnClaseFactoryMethodKits;

public class KitEscolar implements IKit{
	Mochila mochila;
	Deportivo deportivo;
	Cuaderno cuaderno;
	
	public KitEscolar() {
		mochila = new Mochila();
		deportivo = new Deportivo();
		cuaderno = new Cuaderno();
	}
	
	
	public Mochila getMochila() {
		return mochila;
	}


	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}


	public Deportivo getDeportivo() {
		return deportivo;
	}


	public void setDeportivo(Deportivo deportivo) {
		this.deportivo = deportivo;
	}


	public Cuaderno getCuaderno() {
		return cuaderno;
	}


	public void setCuaderno(Cuaderno cuaderno) {
		this.cuaderno = cuaderno;
	}


	@Override
	public void crear() {
		mochila.mostrarInfo();
		deportivo.mostrarInfo();
		cuaderno.mostrarInfo();
	}

}
