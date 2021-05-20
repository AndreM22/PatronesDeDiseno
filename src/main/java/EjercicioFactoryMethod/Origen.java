package EjercicioFactoryMethod;

public class Origen {

	private String ciudad;
	private String pais;
	private String aeropuerto;

	public void showInfo() {
		System.out.println("Origen: ");
		System.out.println("Ciudad: " + ciudad);
		System.out.println("Pais: " + pais);
		System.out.println("Aeropuerto: " + aeropuerto);

	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(String aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

}
