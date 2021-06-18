package EjercicioAdapterArtefactos;

public class Televisor implements IElectronicosGrandes {
	private String modelo;
	private int costo;
	private String tiempoDeGarantia;

	public Televisor(String modelo, int precio, String tiempoDeGarantia) {
		this.modelo = modelo;
		this.costo = precio;
		this.tiempoDeGarantia = tiempoDeGarantia;
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
		System.out.println("El costo del televisor es: " + costo);
		
	}

	@Override
	public void tiempoDeGarantia() {
		System.out.println("El tiempo de garantia del celular es de: " + tiempoDeGarantia);
		
	}

}