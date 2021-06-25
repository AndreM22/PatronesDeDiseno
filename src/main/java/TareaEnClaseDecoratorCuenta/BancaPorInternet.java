package TareaEnClaseDecoratorCuenta;

public class BancaPorInternet implements ICuenta {
	boolean enable;
	ICuenta cuenta;

	public BancaPorInternet(ICuenta cuenta, boolean enable) {
		this.cuenta = cuenta;
		this.enable = enable;
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
		System.out.println("Tarjeta habilitada para banca por internet: " + enable);

	}


}
