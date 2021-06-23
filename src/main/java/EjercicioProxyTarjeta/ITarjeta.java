package EjercicioProxyTarjeta;

public interface ITarjeta {
	void comprar(double monto, String moneda);

	void agregarFondos(double monto, String moneda);

}
