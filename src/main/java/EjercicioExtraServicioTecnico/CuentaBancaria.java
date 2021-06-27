package EjercicioExtraServicioTecnico;

import java.util.LinkedList;
import java.util.List;


public class CuentaBancaria {
	int monto;
	static List<Duenos> dueno;

	public static CuentaBancaria instance = null;

	private CuentaBancaria() {
		dueno = new LinkedList<Duenos>();
		monto = 0;
	}

	public synchronized static void addDueno(Duenos nuevoDueno) {
		dueno.add(nuevoDueno);
	}

	private synchronized static void makeInstace() {
		if (instance == null)
			instance = new CuentaBancaria();
	}

	public static CuentaBancaria getInstance() {
		if (instance == null)
			makeInstace();
		return instance;
	}

	public synchronized int repararComputador(Computadora computadora) {
		ServicioReparacion servicioReparacion = new ServicioReparacion();
		int precio = computadora.recivirReparacion(servicioReparacion);
		System.out.println("Se cobrarán: " + precio + "bs por el servicio");
		return precio;

	}

	public synchronized void pagar(int monto) {
		this.monto += monto;
		System.out.println("Se recibio el pago, el nuevo monto en cuenta es: " + monto + "bs");
		NotificarTransaccion nt = new NotificarTransaccion();
		for (Duenos d : dueno) {
			nt.addDueno(d);
		}
		nt.enviar("Se ha recibido el monto de " + monto + "bs");
	}

//	public synchronized int getMonto() {
//		return monto;
//	}
//
//	public synchronized void setMonto(int monto) {
//		this.monto = monto;
//	}

}
