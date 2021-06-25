package EjercicioDecoratorWarCarft;

public class Personaje implements IPersonaje {
	String nombre;
	int nivel;
	String armas;
	int porcentajeArmadura;
	int puntosDefensa;
	int puntosAtaque;
	int puntosRegeneracion;

	public Personaje(String nombre) {
		this.nombre = nombre;
		nivel = 1;
		armas = "";
		porcentajeArmadura = 1;
		puntosDefensa = 1;
		puntosAtaque = 1;
		puntosRegeneracion = 1;
	}

	@Override
	public String nombre() {
		return nombre;
	}

	@Override
	public int nivel() {
		return nivel;
	}

	@Override
	public void subirNivel(int niveles) {
		nivel += niveles;
	}

	@Override
	public String armas() {
		return armas;
	}

	@Override
	public void equiparArma(String arma) {
		this.armas = arma;
	}

	@Override
	public int porcentajeArmadura() {
		return this.porcentajeArmadura;
	}

	@Override
	public int puntosAtaque() {
		return this.puntosAtaque;
	}

	@Override
	public int puntosDefensa() {
		return this.puntosDefensa;
	}

	@Override
	public int puntosRegeneracion() {
		return this.puntosRegeneracion;
	}

	@Override
	public void aumentarArmadura(int porcentaje) {
		this.porcentajeArmadura += porcentaje;

	}

	@Override
	public void aumentarAtaque(int puntos) {
		this.puntosAtaque += puntos;

	}

	@Override
	public void aumentarDefensa(int puntos) {
		this.puntosDefensa += puntos;
	}

	@Override
	public void aumentarRegeneracion(int puntos) {
		this.puntosRegeneracion += puntos;

	}

	@Override
	public void info() {
		System.out.println("**********************");
		System.out.println("Nombre: " + nombre);
		System.out.println("Nivel: " + nivel);
		if (!armas.isEmpty()) {
			System.out.println("Armas: " + armas);
		} else {
			System.out.println("Sin armamento");
		}
		System.out.println("Porcentaje de armadura: " + porcentajeArmadura);
		System.out.println("Puntos defensa: " + puntosDefensa);
		System.out.println("Puntos ataque: " + puntosAtaque);
		System.out.println("Puntos regeneracion: " + puntosRegeneracion);

	}

}
