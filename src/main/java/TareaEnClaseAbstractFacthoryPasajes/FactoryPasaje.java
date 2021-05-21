package TareaEnClaseAbstractFacthoryPasajes;


public class FactoryPasaje {
	
	static IPasaje pasajeI = new PasajeInfantes();
	static IPasaje pasajeS = new PasajeSolidario();
	static IPasaje pasajeST = new PasajeStandart();
	enum Pasajes {
		PasajeStandart, PasajeInfantes, PasajeSolidario
	}

	public static IPasaje make(Pasajes p) {
		switch (p) {

		case PasajeStandart:
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
			
			((PasajeStandart)(pasajeST)).setAsiento("j3");
			((PasajeStandart)(pasajeST)).setCostoDePasaje(50.0);
			((PasajeStandart)(pasajeST)).setNumeroDeVuelo(332);
			((PasajeStandart)(pasajeST)).setOrigen(origen);
			((PasajeStandart)(pasajeST)).setDestino(destino);
			((PasajeStandart)(pasajeST)).setAvion(avion);
			((PasajeStandart)(pasajeST)).setPasajero(pasajero);
			
			return pasajeST;

		case PasajeInfantes:
			origen = new Origen();
			origen.setAeropuerto("Aeropuerto de Washington");
			origen.setCiudad("Washington");
			origen.setPais("Estados Unidos");
			
			destino = new Destino();
			destino.setAeropuerto("Aeropuerto de Tokio");
			destino.setCiudad("Tokio");
			destino.setPais("Japón");
			
			avion= new Avion();
			avion.setCapacidad("10000kg");
			avion.setMarca("Boeing");
			avion.setModelo("777");
			avion.setNumeroDeAsientos(300);
			
			pasajero = new Pasajero();
			pasajero.setCi(7778394);
			pasajero.setNombre("James Potter");
			pasajero.setFechaDeNacimiento("25/08/2020");
			
			
			((PasajeInfantes)(pasajeI)).setAsiento("a8");
			((PasajeInfantes)(pasajeI)).setCostoEspecial(150);
			((PasajeInfantes)(pasajeI)).setNumeroDeVuelo(1232);
			((PasajeInfantes)(pasajeI)).setOrigen(origen);
			((PasajeInfantes)(pasajeI)).setDestino(destino);
			((PasajeInfantes)(pasajeI)).setAvion(avion);
			((PasajeInfantes)(pasajeI)).setPasajero(pasajero);
			return pasajeI;

		case PasajeSolidario:
			origen = new Origen();
			origen.setAeropuerto("Aeropuerto de Sucre");
			origen.setCiudad("Sucre");
			origen.setPais("Bolivia");
			
			destino = new Destino();
			destino.setAeropuerto("Aeropuerto de Santiago");
			destino.setCiudad("Santiago");
			destino.setPais("Chile");
			
			avion= new Avion();
			avion.setCapacidad("25000kg");
			avion.setMarca("Airbus");
			avion.setModelo("A330");
			avion.setNumeroDeAsientos(300);
			
			pasajero = new Pasajero();
			pasajero.setCi(9984736);
			pasajero.setNombre("Paola");
			
			
			((PasajeSolidario)(pasajeS)).setAsiento("a8");
			((PasajeSolidario)(pasajeS)).setCostoDePasaje(290.0);
			((PasajeSolidario)(pasajeS)).setNumeroDeVuelo(1232);
			((PasajeSolidario)(pasajeS)).setDescuento("25%");
			((PasajeSolidario)(pasajeS)).setMotivoDelDescuento("Enfermedad");
			((PasajeSolidario)(pasajeS)).setOrigen(origen);
			((PasajeSolidario)(pasajeS)).setDestino(destino);
			((PasajeSolidario)(pasajeS)).setAvion(avion);
			((PasajeSolidario)(pasajeS)).setPasajero(pasajero);
			return pasajeS;

		}
		return null;
	}
}
