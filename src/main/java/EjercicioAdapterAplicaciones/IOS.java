package EjercicioAdapterAplicaciones;

public class IOS implements AplicacionesMoviles {

	@Override
	public void login() {
		System.out.println("Se está haciendo login en la aplicacion de IOS");

	}

	@Override
	public void logout() {
		System.out.println("Se está haciendo logout en la aplicacion de IOS");

	}

	@Override
	public void reportes() {
		System.out.println("Se están generando reportes en la aplicacion de IOS");

	}

}
