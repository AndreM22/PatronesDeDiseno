package TareaEnClaseDecoratorCuenta;

import java.util.Random;

public class Promocion implements ICuenta {
	boolean ganador;
	Random rd = new Random();
	ICuenta cuenta;

	public Promocion(ICuenta cuenta) {
		this.cuenta = cuenta;
		int numeroAleatorio = rd.nextInt(100)+1;
		ganador= numeroAleatorio % 2==0;
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
		if(ganador) {
			System.out.println("GANASTE LA PROMOCION");
			cuenta.agregarFondos(cuenta.monto());
			System.out.println("Nuevo monto en cuenta: "+cuenta.monto());
		}else {
			System.out.println("No ganaste la promocion");
		}
	}
}
