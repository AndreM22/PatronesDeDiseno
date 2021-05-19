package EjercicioPrototypeCelular;

public class Sim implements ISim {
	private String NombreEmpresaTelefónica;
	private int NumeroDeTelefono;

	public String getNombreEmpresaTelefónica() {
		return NombreEmpresaTelefónica;
	}

	public void setNombreEmpresaTelefónica(String nombreEmpresaTelefónica) {
		NombreEmpresaTelefónica = nombreEmpresaTelefónica;
	}

	public int getNumeroDeTelefono() {
		return NumeroDeTelefono;
	}

	public void setNumeroDeTelefono(int numeroDeTelefono) {
		NumeroDeTelefono = numeroDeTelefono;
	}

	@Override
	public Object clone() {
        Sim objClone= new Sim();
        objClone.setNombreEmpresaTelefónica(NombreEmpresaTelefónica);
        objClone.setNumeroDeTelefono(NumeroDeTelefono);
        return objClone;
	}
    public void mostrarInfo() {
    	System.out.println("Nombre de empresa telefónica " +this.NombreEmpresaTelefónica);
    	System.out.println("Numero de telefono " +this.NumeroDeTelefono);
    }
}
