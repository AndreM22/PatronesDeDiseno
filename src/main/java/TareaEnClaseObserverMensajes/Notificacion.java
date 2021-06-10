package TareaEnClaseObserverMensajes;

public class Notificacion {
	private String tipo;
	private String mensaje;

	public Notificacion(String tipo, String mensaje) {
		this.tipo = tipo;
		this.mensaje = mensaje;
	}

	public void showInfo() {
		System.out.println("Tipo: " + tipo);
		System.out.println("Mensaje: " + mensaje);
		System.out.println();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
