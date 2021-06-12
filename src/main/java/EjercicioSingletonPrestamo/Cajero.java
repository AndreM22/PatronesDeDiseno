package EjercicioSingletonPrestamo;

public class Cajero implements ICobrante {
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
		if ((prestamoInicial - prestamoActual) < prestamoInicial / 4) {
			System.out.println("Los cajeros estan procesando su pago");
			Banco.getInstance().pagarDeuda(monto);
		} else {
			next.pagar(monto, prestamoInicial);
		}
	}

}
