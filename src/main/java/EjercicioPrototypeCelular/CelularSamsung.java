package EjercicioPrototypeCelular;

public class CelularSamsung implements ICelular{
	private String tamanio;
	private String cpu;
	private String memoria;
	private Sim sim;
	private String versionAndroid;
	private String camara;
	private String bluetooth;
	private int cantidadDeMemoriasExternas;
	private String tipoBateria;
	private Accesorios accesorios;
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public String getVersionAndroid() {
		return versionAndroid;
	}
	public void setVersionAndroid(String versionAndroid) {
		this.versionAndroid = versionAndroid;
	}
	public String getCamara() {
		return camara;
	}
	public void setCamara(String cámara) {
		this.camara = cámara;
	}
	public String getBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(String bluetooth) {
		this.bluetooth = bluetooth;
	}
	public int getCantidadDeMemoriasExternas() {
		return cantidadDeMemoriasExternas;
	}
	public void setCantidadDeMemoriasExternas(int cantidadDeMemoriasExternas) {
		this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
	}
	public String getTipoBateria() {
		return tipoBateria;
	}
	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}
	public Accesorios getAccesorios() {
		return accesorios;
	}
	public void setAccesorios(Accesorios accesorios) {
		this.accesorios = accesorios;
	}

    @Override
    public Object clone() {
        CelularSamsung objClone= new CelularSamsung();
        objClone.setTamanio(this.tamanio);
        objClone.setCpu(this.cpu);
        objClone.setMemoria(this.memoria);
        objClone.setSim((Sim)(this.sim.clone()));
        objClone.setVersionAndroid(this.versionAndroid);
        objClone.setCamara(this.camara);
        objClone.setBluetooth(this.bluetooth);
        objClone.setCantidadDeMemoriasExternas(this.cantidadDeMemoriasExternas);
        objClone.setTipoBateria(this.tipoBateria);
        objClone.accesorios=this.accesorios;
        return objClone;
    }
    
    public void mostrarInfo() {
    	System.out.println("Versión bluetooth" +this.bluetooth);
    	System.out.println("Cámara: "+this.camara);
    	System.out.println("Cantidad de memorias externas: "+this.cantidadDeMemoriasExternas);
    	System.out.println("Cpu: "+this.cpu);
    	System.out.println("Memoria: "+this.memoria);
    	System.out.println("Tamaño: "+this.tamanio);
    	System.out.println("Tipo de bateria:"+this.tipoBateria);
    	System.out.println("Version de android"+this.versionAndroid);
    	this.accesorios.mostrarInfo();
    	this.sim.mostrarInfo();

    }
}
