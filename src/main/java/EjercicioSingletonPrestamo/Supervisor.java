package EjercicioSingletonPrestamo;

public class Supervisor implements ICobrante {
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
		double prestamoActual = Banco.getInstance().getPrestamo() - monto;
		if (Banco.getInstance().getPrestamo() > 0.1) {
			System.out.println("El supervisor recibe el pago y ofrece nuevos préstamos");
			Banco.getInstance().pagarDeuda(monto);
		} else {
			next.pagar(monto, prestamoInicial);
		}
	}

}