package EjercicioFactoryMethod;

public class CreatorPasajeInfantes extends CreatorPasaje{

	@Override
	public PasajeInfantes create() {
		Origen origen = new Origen();
		origen.setAeropuerto("Aeropuerto de Washington");
		origen.setCiudad("Washington");
		origen.setPais("Estados Unidos");
		
		Destino destino = new Destino();
		destino.setAeropuerto("Aeropuerto de Tokio");
		destino.setCiudad("Tokio");
		destino.setPais("Japón");
		
		Avion avion= new Avion();
		avion.setCapacidad("10000kg");
		avion.setMarca("Boeing");
		avion.setModelo("777");
		avion.setNumeroDeAsientos(300);
		
		Pasajero pasajero = new Pasajero();
		pasajero.setCi(7778394);
		pasajero.setNombre("James Potter");
		pasajero.setFechaDeNacimiento("25/08/2020");
		
		PasajeInfantes pasaje = new PasajeInfantes();
		pasaje.setAsiento("a8");
		pasaje.setCostoEspecial(150);
		pasaje.setNumeroDeVuelo(1232);
		pasaje.setOrigen(origen);
		pasaje.setDestino(destino);
		pasaje.setAvion(avion);
		pasaje.setPasajero(pasajero);

		return pasaje;
	}

}
