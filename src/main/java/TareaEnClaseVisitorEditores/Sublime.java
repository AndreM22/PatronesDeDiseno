package TareaEnClaseVisitorEditores;

public class Sublime implements IEditor {
	private Documento documento;
	private int palabras;

	public int getPalabras() {
		return palabras;
	}

	public void setPalabras(int palabras) {
		this.palabras = palabras;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public void crear(Documento documento) {
		System.out.println("***************");
		System.out.println("Creando el documento en Sublime");
		this.documento = documento;
		documento.showInfo();

	}

	public void editar(String contenido) {
		System.out.println("***************");
		System.out.println("Editando el documento en Sublime");
		documento.setContenido(contenido);
		documento.showInfo();

	}

	public void eliminar() {
		System.out.println("***************");
		System.out.println("Eliminando el documento en Sublime");
		documento = new Documento("", "");
	}

	@Override
	public void guardarPDF(IGuardarPDF guardador) {
		guardador.guardandoPDF(this);

	}
}
