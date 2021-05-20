package EjercicioFactoryMethod;

public class Avion {

	private String marca;
	private String capacidad;
	private String modelo;
	private int numeroDeAsientos;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroDeAsientos() {
		return numeroDeAsientos;
	}

	public void setNumeroDeAsientos(int numeroDeAsientos) {
		this.numeroDeAsientos = numeroDeAsientos;
	}

	public void showInfo() {
		System.out.println("Avion: ");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo " + modelo);
		System.out.println("Numero de asientos:" + numeroDeAsientos);
	}

}
