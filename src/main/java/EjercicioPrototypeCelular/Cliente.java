package EjercicioPrototypeCelular;

public class Cliente {
	public static void main(String[] args) {
		Accesorios accesoriosPorDefecto = new Accesorios();
		accesoriosPorDefecto.setAudifonos(true);
		accesoriosPorDefecto.setCargador(true);
		accesoriosPorDefecto.setEstuche(false);

		Sim sim1 = new Sim();
		sim1.setNombreEmpresaTelefónica("Entel");
		sim1.setNumeroDeTelefono(63249477);

		Sim sim2 = new Sim();
		sim2.setNombreEmpresaTelefónica("Viva");
		sim2.setNumeroDeTelefono(75649240);

		Sim sim3 = new Sim();
		sim3.setNombreEmpresaTelefónica("Tigo");
		sim3.setNumeroDeTelefono(74441233);

		CelularSamsung celular1 = new CelularSamsung();
		celular1.setAccesorios(accesoriosPorDefecto);
		celular1.setBluetooth("4.2");
		celular1.setCamara("10 Mpx");
		celular1.setCantidadDeMemoriasExternas(2);
		celular1.setCpu("SnapDragon");
		celular1.setMemoria("128 gigas");
		celular1.setSim(sim1);
		celular1.setTamanio("5.7 pulgadas");
		celular1.setTipoBateria("Ion Litio");
		celular1.setVersionAndroid("10.0");

		CelularSamsung celular2 = (CelularSamsung) (celular1.clone());
		celular2.setSim(sim2);
		celular2.setVersionAndroid("9.0");
		
		CelularSamsung celular3 = (CelularSamsung) (celular1.clone());
		celular3.setSim(sim3);
		celular3.setVersionAndroid("9.2");
		
		celular1.mostrarInfo();
		System.out.println();
		celular2.mostrarInfo();
		System.out.println();
		celular3.mostrarInfo();
	}
}
