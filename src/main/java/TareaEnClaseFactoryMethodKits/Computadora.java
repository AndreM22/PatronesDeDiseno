package TareaEnClaseFactoryMethodKits;

public class Computadora {
	String marca;
	String sistemaOperativo;
	
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getSistemaOperativo() {
		return sistemaOperativo;
	}


	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}


	public void mostrarInfo() {
		System.out.println("Marca: "+marca);
		System.out.println("Sistema Operativo: "+sistemaOperativo);

	}
}
