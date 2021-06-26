package EjercicioCompositeArchivo;

public class Archivo extends Documento {
	public Archivo(String contenido) {
		this.contenido = contenido;
		this.palabras = contenido.split(" ").length;
	}

	@Override
	public void MostrarPalabras() {
		System.out.println("Numero de palabras: " + palabras);

	}

	@Override
	public void add(Documento component) {
		System.out.println("No aplicable");

	}

	@Override
	public void remove(Documento component) {
		System.out.println("No palicable");

	}

	@Override
	public void getChild(int position) {
		System.out.println("No aplicable");
	}

}
