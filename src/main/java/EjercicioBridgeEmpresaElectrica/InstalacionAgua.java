package EjercicioBridgeEmpresaElectrica;

public class InstalacionAgua implements IInstalacion{
	String nombre;
	double precio;
	IFormaDePago pago;
	public InstalacionAgua(String nombre, double precio, IFormaDePago pago) {
		this.nombre = nombre;
		this.precio = precio;
		this.pago=pago;
	}
	@Override
	public void pagar() {
		pago.pagar(precio);
	}

	
}
