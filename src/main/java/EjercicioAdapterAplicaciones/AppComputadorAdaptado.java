package EjercicioAdapterAplicaciones;

public class AppComputadorAdaptado implements AplicacionesMoviles {
	private AplicacionesComputador appC;

	public AppComputadorAdaptado(AplicacionesComputador appC) {
		System.out.println("Adaptando La aplicacion del computador a una móvil");
		this.appC = appC;
	}

	@Override
	public void login() {
		appC.iniciarSesion();
	}

	@Override
	public void logout() {
		appC.cerrarSesion();

	}

	@Override
	public void reportes() {
		appC.generarDatos();

	}

}
