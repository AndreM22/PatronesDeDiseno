package EjercicioAdapterAplicaciones;

public class Escritorio implements AplicacionesComputador {

	@Override
	public void iniciarSesion() {
		System.out.println("Se esta iniciando sesi�n en la aplicai�n de escritorio");
	}

	@Override
	public void cerrarSesion() {
		System.out.println("Se esta cerrando sesi�n en la aplicai�n de escritorio");

	}

	@Override
	public void generarDatos() {
		System.out.println("Se estan generando datos en la aplicai�n de escritorio");

	}

}
