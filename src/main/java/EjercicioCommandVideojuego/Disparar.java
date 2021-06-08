package EjercicioCommandVideojuego;

public class Disparar implements IAcciones {
	private Personaje personaje;

	public Disparar(Personaje personaje) {
		this.personaje = personaje;
	}

	@Override
	public void execute() {
		this.personaje.disparar();
	}
}
