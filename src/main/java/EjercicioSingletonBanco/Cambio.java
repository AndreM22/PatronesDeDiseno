package EjercicioSingletonBanco;

public class Cambio {
	private static Cambio instance = null;
	private double DolaresABolivianos;
	private double BolivianosADolares;
	private double DolaresAEuros;
	private double EurosADolares;
	private double EurosABolivianos;
	private double BolivianosAEuros;

	private Cambio() {
		DolaresABolivianos = 6.96;
		BolivianosADolares = 0.15;
		DolaresAEuros = 0.82;
		EurosADolares = 1.22;
		EurosABolivianos = 8.43;
		BolivianosAEuros = 0.12;
		System.out.println("INFO> Instanciando entidad");
	}

	public static synchronized void makeInstance() {
		if (instance == null)
			instance = new Cambio();
	}

	public static Cambio getInstance() {
		if (instance == null)
			makeInstance();
		return instance;
	}

	public double ObtenerCambio(double cantidad, String tipoDeCambio) {
		if (tipoDeCambio.equals("DolaresABolivianos")) {
			return DolaresABolivianos * cantidad;
		} else if (tipoDeCambio.equals("BolivianosADolares")) {
			return BolivianosADolares * cantidad;
		} else if (tipoDeCambio.equals("DolaresAEuros")) {
			return DolaresAEuros * cantidad;
		} else if (tipoDeCambio.equals("EurosADolares")) {
			return EurosADolares * cantidad;
		} else if (tipoDeCambio.equals("EurosABolivianos")) {
			return EurosABolivianos * cantidad;
		} else if (tipoDeCambio.equals("BolivianosAEuros")) {
			return BolivianosAEuros * cantidad;
		} else
			return 0;
	}
}
