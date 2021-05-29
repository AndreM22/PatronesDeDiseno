package TareaEnClaseFactoryMethodKits;

public class Mochila{
	int numeroBolsillos;
	String tamano;
	public int getNumeroBolsillos() {
		return numeroBolsillos;
	}
	public void setNumeroBolsillos(int numeroBolsillos) {
		this.numeroBolsillos = numeroBolsillos;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	
	public void mostrarInfo() {
		System.out.println("Numero de bolsillos"+numeroBolsillos);
		System.out.println("Tamaño"+tamano);
	}
}
