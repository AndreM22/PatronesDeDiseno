package EjercicioPrototypeCelular;

public class Accesorios {
	private boolean audifonos;
	private boolean cargador;
	private boolean estuche;
	public boolean isAudifonos() {
		return audifonos;
	}
	public void setAudifonos(boolean audifonos) {
		this.audifonos = audifonos;
	}
	public boolean isCargador() {
		return cargador;
	}
	public void setCargador(boolean cargador) {
		this.cargador = cargador;
	}
	public boolean isEstuche() {
		return estuche;
	}
	public void setEstuche(boolean estuche) {
		this.estuche = estuche;
	}
    public void mostrarInfo() {
    	System.out.println("Tiene audifonos " +this.audifonos);
    	System.out.println("Tiene cargador "+this.cargador);
    	System.out.println("Tiene estuche "+this.estuche);
    }
}
