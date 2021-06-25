package TareaEnClaseDecoratorCuenta;

public class Seguro implements ICuenta {
	int precio;
	ICuenta cuenta;

	public Seguro(int precio, ICuenta cuenta) {
		this.precio = precio;
		this.cuenta = cuenta;
	}

	@Override
	public int monto() {
		return cuenta.monto();
	}

	@Override
	public String nombrePropietario() {

		return cuenta.nombrePropietario();
	}

	@Override
	public void agregarFondos(int cantidad) {
		cuenta.agregarFondos(cantidad);

	}

	@Override
	public void quitarFondos(int cantidad) {
		cuenta.quitarFondos(cantidad);

	}

	@Override
	public void informacionCuenta() {
		cuenta.informacionCuenta();
		cuenta.quitarFondos(precio);
		System.out.println("Seguro de la cuenta habilitado, monto disponible actual: " + cuenta.monto());
	}

}
