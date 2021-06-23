package EjercicioProxyTarjeta;

public class VerificacionTarjeta implements ITarjeta {
	TarjetaDebito tarjetaDebito;

	public VerificacionTarjeta(double monto) {
		tarjetaDebito = new TarjetaDebito(monto);
	}

	@Override
	public void comprar(double monto, String moneda) {
		if (moneda.equals("bolivianos")) {
			tarjetaDebito.comprar(monto, moneda);
		} else if (moneda.equals("dolares")) {
			double nuevoMonto = monto * 6.96;
			tarjetaDebito.comprar(nuevoMonto, "bolivianos");
		} else if (moneda.equals("euros")) {
			double nuevoMonto = monto * 8.23;
			tarjetaDebito.comprar(nuevoMonto, "bolivianos");
		} else {
			System.out.println("No se pudo procesar el pago");
		}

	}

	@Override
	public void agregarFondos(double monto, String moneda) {
		if (moneda.equals("bolivianos")) {
			tarjetaDebito.agregarFondos(monto, moneda);
		} else if (moneda.equals("dolares")) {
			double nuevoMonto = monto * 6.96;
			tarjetaDebito.agregarFondos(nuevoMonto, "bolivianos");
		} else if (moneda.equals("euros")) {
			double nuevoMonto = monto * 8.23;
			tarjetaDebito.agregarFondos(nuevoMonto, "bolivianos");
		} else {
			System.out.println("No se pudo procesar la suma introducida");
		}
	}

}
