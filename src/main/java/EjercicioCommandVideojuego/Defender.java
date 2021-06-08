package EjercicioCommandVideojuego;

public class Defender implements IAcciones {
	private Personaje personaje;

	public Defender(Personaje personaje) {
		this.personaje = personaje;
	}

	@Override
	public void execute() {
		this.personaje.modoDefensa();
	}
}
