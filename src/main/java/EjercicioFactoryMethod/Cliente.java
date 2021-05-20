package EjercicioFactoryMethod;

public class Cliente {

	public static void main(String[] args) {
		CreatorPasajeStandart crearPasajeStandart = new CreatorPasajeStandart();
		CreatorPasajeSolidario crearPasajeSolidario = new CreatorPasajeSolidario();
		CreatorPasajeInfantes crearPasajeInfantes  = new CreatorPasajeInfantes();
		
		PasajeStandart pasaje1 = crearPasajeStandart.create();
		
		PasajeStandart pasaje2 = crearPasajeStandart.create();
		Pasajero pasajero2 = pasaje2.getPasajero();
		pasajero2.setNombre("Ana");
		pasajero2.setCi(7746593);
		pasaje2.setPasajero(pasajero2);
		pasaje2.setAsiento("12a");
		
		PasajeInfantes pasaje3 = crearPasajeInfantes.create();
		
		PasajeInfantes pasaje4 = crearPasajeInfantes.create();
		Pasajero pasajero4 = pasaje4.getPasajero();		
		pasajero4.setNombre("Julian");
		pasajero4.setCi(5544593);
		pasajero4.setFechaDeNacimiento("23/1/2019");
		pasaje4.setPasajero(pasajero4);
		pasaje4.setAsiento("1l");
		
		PasajeSolidario pasaje5 = crearPasajeSolidario.create();
		
		PasajeSolidario pasaje6 = crearPasajeSolidario.create();
		Pasajero pasajero6 = pasaje6.getPasajero();
		pasajero6.setNombre("Verónica");
		pasajero6.setCi(4364936);
		pasaje6.setPasajero(pasajero6);
		pasaje6.setAsiento("4d");
		
		pasaje1.crear();
		pasaje2.crear();
		pasaje3.crear();
		pasaje4.crear();
		pasaje5.crear();
		pasaje6.crear();

	}

}
