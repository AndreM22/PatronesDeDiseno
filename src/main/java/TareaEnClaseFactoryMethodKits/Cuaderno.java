package TareaEnClaseFactoryMethodKits;

public class Cuaderno {
	String tipo;
	int numeroDeHojas;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumeroDeHojas() {
		return numeroDeHojas;
	}
	public void setNumeroDeHojas(int numeroDeHojas) {
		this.numeroDeHojas = numeroDeHojas;
	}
	public void mostrarInfo() {
		System.out.println("Tipo: "+tipo);
		System.out.println("Numero de hojas: "+numeroDeHojas);

	}
	
}
