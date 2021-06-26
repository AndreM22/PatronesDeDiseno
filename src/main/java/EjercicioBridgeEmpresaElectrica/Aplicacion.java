package EjercicioBridgeEmpresaElectrica;

public class Aplicacion implements IFormaDePago {

	@Override
	public void pagar(double monto) {
		System.out.println("***");
		System.out.println("Se debe pagar el monto de: " + (monto*0.9));

	}

}
