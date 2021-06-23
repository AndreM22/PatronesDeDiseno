package EjercicioProxyTarjeta;

public class TarjetaDebito implements ITarjeta {
	double ahorros;

	public double getAhorros() {
		return ahorros;
	}

	public TarjetaDebito(double ahorros) {
		this.ahorros = ahorros;
	}

	@Override
	public void comprar(double monto, String moneda) {
		if (ahorros > monto) {
			ahorros -= monto;
			System.out.println("El saldo después de la compra es de: " + ahorros);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

	@Override
	public void agregarFondos(double monto, String moneda) {
		ahorros += monto;
		System.out.println("El saldo actual es de: " + ahorros);
	}

}
