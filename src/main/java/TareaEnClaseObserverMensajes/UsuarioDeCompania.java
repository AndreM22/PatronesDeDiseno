package TareaEnClaseObserverMensajes;

import java.util.LinkedList;
import java.util.List;

public class UsuarioDeCompania implements IUsuario {

	private List<String> categorias;
	private Persona persona;

	public UsuarioDeCompania(Persona persona) {
		this.persona = persona;
		categorias = new LinkedList<String>();
	}

	@Override
	public void update(String message, Notificacion notificacion) {
		System.out.println("********* NOTIFY *********");
		System.out.println(message);
		persona.info();
		notificacion.showInfo();
	}

	@Override
	public List<String> getCategorias() {
		return this.categorias;
	}
	
	public void add(String categoria) {
		categorias.add(categoria);
	}
}