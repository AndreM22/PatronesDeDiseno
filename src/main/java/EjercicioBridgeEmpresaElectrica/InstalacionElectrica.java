package EjercicioBridgeEmpresaElectrica;

public class InstalacionElectrica implements IInstalacion{
	String nombre;
	double precio;
	IFormaDePago pago;
	public InstalacionElectrica(String nombre, double precio, IFormaDePago pago) {
		this.nombre = nombre;
		this.precio = precio;
		this.pago=pago;
	}
	@Override
	public void pagar() {
		pago.pagar(precio);
	}

	
}
