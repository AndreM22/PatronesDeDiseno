package EjercicioAdapterArtefactos;

public class Lavadora implements IElectronicosGrandes {
	private String modelo;
	private int costo;
	private String tiempoDeGarantia;

	public Lavadora(String modelo, int precio, String tiempoDeVida) {
		this.modelo = modelo;
		this.costo = precio;
		this.tiempoDeGarantia = tiempoDeVida;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int precio) {
		this.costo = precio;
	}

	public String getTiempoDeGarantia() {
		return tiempoDeGarantia;
	}

	public void setTiempoDeGarantia(String tiempoDeVida) {
		this.tiempoDeGarantia = tiempoDeVida;
	}


	@Override
	public void costo() {
		System.out.println("El costo de la lavadora es: " + costo);
		
	}

	@Override
	public void tiempoDeGarantia() {
		System.out.println("El tiempo de garantia de la lavadora es de: " + tiempoDeGarantia);
		
	}

}