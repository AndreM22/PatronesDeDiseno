package TareaEnClaseFactoryMethodKits;

public class Libros {
	String tipo;
	String autor;
	
	
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public void mostrarInfo() {
		System.out.println("Tipo: "+tipo);
		System.out.println("Autor: "+autor);

	}
}
