package EjercicioCompositeArchivo;

import java.util.LinkedList;
import java.util.List;

public class ContenedorDeArchivos extends Documento {
	List<Documento> documentos;

	public ContenedorDeArchivos() {
		documentos = new LinkedList<Documento>();
	}

	@Override
	public int obtenerNumeroDePalabras() {
		int p = 0;
		for (Documento archivo : documentos) {
			p += archivo.obtenerNumeroDePalabras();
		}
		palabras = p;
		return p;
	}

	@Override
	public void MostrarPalabras() {
		this.obtenerNumeroDePalabras();
		System.out.println("Numero de palabras: " + palabras);
	}

	@Override
	public void add(Documento component) {
		documentos.add(component);

	}

	@Override
	public void remove(Documento component) {
		documentos.remove(component);

	}

	@Override
	public void getChild(int position) {
		documentos.get(position);

	}

}
