package TareaEnClaseFactoryMethodKits;

public class Deportivo {
	String talla;
	String color;
	int numeroDePrendas;
	
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumeroDePrendas() {
		return numeroDePrendas;
	}
	public void setNumeroDePrendas(int numeroDePrendas) {
		this.numeroDePrendas = numeroDePrendas;
	}
	
	public void mostrarInfo() {
		System.out.println("Talla: "+talla);
		System.out.println("Color: "+color);
		System.out.println("Numero de prendas"+numeroDePrendas);

	}
}
