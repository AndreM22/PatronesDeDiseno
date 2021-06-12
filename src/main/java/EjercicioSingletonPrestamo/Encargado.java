package EjercicioSingletonPrestamo;

public class Encargado implements ICobrante {
	private ICobrante next;

	@Override
	public void setNext(ICobrante cobrante) {
		next = cobrante;

	}

	@Override
	public ICobrante next() {
		return next;
	}

	@Override
	public void pagar(double monto, double prestamoInicial) {
		System.out.println("El encargado devuelve los documentos");

	}

}
