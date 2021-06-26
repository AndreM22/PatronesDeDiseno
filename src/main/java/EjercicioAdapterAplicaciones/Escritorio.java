package EjercicioAdapterAplicaciones;

public class Escritorio implements AplicacionesComputador {

	@Override
	public void iniciarSesion() {
		System.out.println("Se esta iniciando sesión en la aplicaión de escritorio");
	}

	@Override
	public void cerrarSesion() {
		System.out.println("Se esta cerrando sesión en la aplicaión de escritorio");

	}

	@Override
	public void generarDatos() {
		System.out.println("Se estan generando datos en la aplicaión de escritorio");

	}

}
