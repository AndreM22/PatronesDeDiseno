package EjercicioFactoryMethod;

public class PasajeInfantes implements IPasaje{
	private int numeroDeVuelo ;
	private Destino destino;
	private Origen origen;
	private Avion avion;
	private Pasajero pasajero;
	private String asiento;
	private double costoEspecial;
	
	public PasajeInfantes() {
		destino=new Destino();
		origen = new Origen();
		avion = new Avion();
		pasajero=new Pasajero();
	}

	public int getNumeroDeVuelo() {
		return numeroDeVuelo;
	}

	public void setNumeroDeVuelo(int numeroDeVuelo) {
		this.numeroDeVuelo = numeroDeVuelo;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	
	public double getCostoEspecial() {
		return costoEspecial;
	}

	public void setCostoEspecial(double costoEspecial) {
		this.costoEspecial = costoEspecial;
	}

	@Override
    public void crear() {
		System.out.println();
		System.out.println("Pasaje infantes");
        System.out.println("Numero de Vuelo "+numeroDeVuelo);
        System.out.println("Asiento: "+asiento);
        System.out.println("Precio especial: "+costoEspecial);

        destino.showInfo();
        origen.showInfo();
        avion.showInfo();
        pasajero.showInfo();
    }
}
