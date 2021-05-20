package EjercicioFactoryMethod;

public class CreatorPasajeSolidario extends CreatorPasaje{

	@Override
	public PasajeSolidario create() {
		Origen origen = new Origen();
		origen.setAeropuerto("Aeropuerto de Sucre");
		origen.setCiudad("Sucre");
		origen.setPais("Bolivia");
		
		Destino destino = new Destino();
		destino.setAeropuerto("Aeropuerto de Santiago");
		destino.setCiudad("Santiago");
		destino.setPais("Chile");
		
		Avion avion= new Avion();
		avion.setCapacidad("25000kg");
		avion.setMarca("Airbus");
		avion.setModelo("A330");
		avion.setNumeroDeAsientos(300);
		
		Pasajero pasajero = new Pasajero();
		pasajero.setCi(9984736);
		pasajero.setNombre("Paola");
		
		PasajeSolidario pasaje = new PasajeSolidario();
		pasaje.setAsiento("a8");
		pasaje.setCostoDePasaje(290.0);
		pasaje.setNumeroDeVuelo(1232);
		pasaje.setDescuento("25%");
		pasaje.setMotivoDelDescuento("Enfermedad");
		pasaje.setOrigen(origen);
		pasaje.setDestino(destino);
		pasaje.setAvion(avion);
		pasaje.setPasajero(pasajero);

		return pasaje;
	}
	
}
