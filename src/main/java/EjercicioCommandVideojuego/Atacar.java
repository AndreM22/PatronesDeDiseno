package EjercicioCommandVideojuego;

public class Atacar implements IAcciones {
	private Personaje personaje;

	public Atacar(Personaje personaje) {
		this.personaje = personaje;
	}

	@Override
	public void execute() {
		this.personaje.atacar();
	}
}
