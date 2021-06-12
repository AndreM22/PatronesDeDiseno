package EjercicioSingletonPrestamo;

public interface ICobrante {
	void setNext(ICobrante cobrante);
	ICobrante next();
	void pagar(double monto,double prestamoInicial);
}
