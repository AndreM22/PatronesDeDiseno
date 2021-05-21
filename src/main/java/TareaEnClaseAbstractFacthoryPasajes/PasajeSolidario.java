package TareaEnClaseAbstractFacthoryPasajes;

public class PasajeSolidario extends IPasaje{
	private int numeroDeVuelo ;
	private Destino destino;
	private Origen origen;
	private Avion avion;
	private Pasajero pasajero;
	private String asiento;
	private double costoDePasaje;
	private String descuento;
	private String motivoDelDescuento;
	
	public PasajeSolidario() {
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

	public double getCostoDePasaje() {
		return costoDePasaje;
	}

	public void setCostoDePasaje(double costoDePasaje) {
		this.costoDePasaje = costoDePasaje;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public String getMotivoDelDescuento() {
		return motivoDelDescuento;
	}

	public void setMotivoDelDescuento(String motivoDelDescuento) {
		this.motivoDelDescuento = motivoDelDescuento;
	}

	@Override
    public void crear() {
		System.out.println();
		System.out.println("Pasaje solidario");
        System.out.println("Numero de Vuelo "+numeroDeVuelo);
        System.out.println("Asiento: "+asiento);
        System.out.println("Costo del pasaje:"+costoDePasaje);
        System.out.println("Descuento: "+descuento);
        System.out.println("Motivo del descuento: "+motivoDelDescuento);

        destino.showInfo();
        origen.showInfo();
        avion.showInfo();
        pasajero.showInfo();
    }
}
