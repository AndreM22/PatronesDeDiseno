package EjercicioFactoryMethod;

public class CreatorPasajeStandart extends CreatorPasaje{

	@Override
	public PasajeStandart create() {
		Origen origen = new Origen();
		origen.setAeropuerto("Aeropuerto de La Paz");
		origen.setCiudad("La Paz");
		origen.setPais("Bolivia");
		
		Destino destino = new Destino();
		destino.setAeropuerto("Aeropuerto de Santa Cruz");
		destino.setCiudad("Santa Cruz");
		destino.setPais("Bolivia");
		
		Avion avion= new Avion();
		avion.setCapacidad("1500kg");
		avion.setMarca("Boeing");
		avion.setModelo("747");
		avion.setNumeroDeAsientos(100);
		
		Pasajero pasajero = new Pasajero();
		pasajero.setCi(1239482);
		pasajero.setNombre("Juan");
		
		PasajeStandart pasaje = new PasajeStandart();
		pasaje.setAsiento("j3");
		pasaje.setCostoDePasaje(50.0);
		pasaje.setNumeroDeVuelo(332);
		pasaje.setOrigen(origen);
		pasaje.setDestino(destino);
		pasaje.setAvion(avion);
		pasaje.setPasajero(pasajero);
		
		return pasaje;
	}

}
