package EjercicioAdapterArtefactos;

public class Tableta implements IElectronicosPequenos {
	private String modelo;
	private int precio;
	private String tiempoDeVida;

	public Tableta(String modelo, int precio, String tiempoDeVida) {
		this.modelo = modelo;
		this.precio = precio;
		this.tiempoDeVida = tiempoDeVida;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getTiempoDeVida() {
		return tiempoDeVida;
	}

	public void setTiempoDeVida(String tiempoDeVida) {
		this.tiempoDeVida = tiempoDeVida;
	}

	@Override
	public void precio() {
		System.out.println("El precio de la tableta es: " + precio);
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("El tiempo de vida de la tableta es de: " + tiempoDeVida);
	}

}
