package EjercicioAdapterAplicaciones;

public class WindowsPhone implements AplicacionesMoviles {

	@Override
	public void login() {
		System.out.println("Se est� haciendo login en la aplicacion de WindowsPhone");

	}

	@Override
	public void logout() {
		System.out.println("Se est� haciendo logout en la aplicacion de WindowsPhone");

	}

	@Override
	public void reportes() {
		System.out.println("Se est�n generando reportes en la aplicacion de WindowsPhone");

	}

}