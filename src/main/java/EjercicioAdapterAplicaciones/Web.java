package EjercicioAdapterAplicaciones;

public class Web implements AplicacionesComputador {

	@Override
	public void iniciarSesion() {
		System.out.println("Se esta iniciando sesión en la aplicaión web");
	}

	@Override
	public void cerrarSesion() {
		System.out.println("Se esta cerrando sesión en la aplicaión web");

	}

	@Override
	public void generarDatos() {
		System.out.println("Se estan generando datos en la aplicaión web");

	}

}
