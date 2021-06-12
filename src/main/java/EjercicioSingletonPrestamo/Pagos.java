package EjercicioSingletonPrestamo;

public class Pagos implements ICobrante {
	private ICobrante next;

	@Override
	public void setNext(ICobrante cobrante) {
		this.next = cobrante;
	}

	@Override
	public ICobrante next() {
		return next;
	}

	@Override
	public void pagar(double monto, double prestamoInicial) {
		Cajero cajero = new Cajero();
		this.setNext(cajero);

		AgenteDeCredito agenteDeCredito = new AgenteDeCredito();
		cajero.setNext(agenteDeCredito);

		Supervisor supervisor = new Supervisor();
		agenteDeCredito.setNext(supervisor);

		Encargado encargado = new Encargado();
		supervisor.setNext(encargado);

		this.next.pagar(monto, Banco.getInstance().getPrestamoInicial());
	}

}