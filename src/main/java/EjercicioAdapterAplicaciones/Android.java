package EjercicioAdapterAplicaciones;

public class Android implements AplicacionesMoviles {

	@Override
	public void login() {
		System.out.println("Se está haciendo login en la aplicacion de Android");

	}

	@Override
	public void logout() {
		System.out.println("Se está haciendo logout en la aplicacion de Android");

	}

	@Override
	public void reportes() {
		System.out.println("Se están generando reportes en la aplicacion de Android");

	}

}
