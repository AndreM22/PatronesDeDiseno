package EjercicioSingletonBanco;

public class CasaDeCambio {
	public double DolaresABolivianos(double cantidad) {
		double total=Cambio.getInstance().ObtenerCambio(cantidad, "DolaresABolivianos");
		System.out.println("INFO>La cantidad es: "+total+" bolivianos");
		return total;
	}
	public double BolivianosADolares(double cantidad) {
		double total=Cambio.getInstance().ObtenerCambio(cantidad, "BolivianosADolares");
		System.out.println("INFO>La cantidad es: "+total+" dólares");
		return total;
	}
	public double DolaresAEuros(double cantidad) {
		double total=Cambio.getInstance().ObtenerCambio(cantidad, "DolaresAEuros");
		System.out.println("INFO>La cantidad es: "+total+" euros");
		return total;
	}
	public double EurosADolares(double cantidad) {
		double total=Cambio.getInstance().ObtenerCambio(cantidad, "EurosADolares");
		System.out.println("INFO>La cantidad es: "+total+" dólares");
		return total;
	}
	public double EurosABolivianos(double cantidad) {
		double total=Cambio.getInstance().ObtenerCambio(cantidad, "EurosABolivianos");
		System.out.println("INFO>La cantidad es: "+total+" bolivianos");
		return total;
	}
	public double BolivianosAEuros(double cantidad) {
		double total=Cambio.getInstance().ObtenerCambio(cantidad, "BolivianosAEuros");
		System.out.println("INFO>La cantidad es: "+total+" euros");
		return total;
	}
}
