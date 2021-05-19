package EjercicioPrototypeCelular;

public class Sim implements ISim {
	private String NombreEmpresaTelef�nica;
	private int NumeroDeTelefono;

	public String getNombreEmpresaTelef�nica() {
		return NombreEmpresaTelef�nica;
	}

	public void setNombreEmpresaTelef�nica(String nombreEmpresaTelef�nica) {
		NombreEmpresaTelef�nica = nombreEmpresaTelef�nica;
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
        objClone.setNombreEmpresaTelef�nica(NombreEmpresaTelef�nica);
        objClone.setNumeroDeTelefono(NumeroDeTelefono);
        return objClone;
	}
    public void mostrarInfo() {
    	System.out.println("Nombre de empresa telef�nica " +this.NombreEmpresaTelef�nica);
    	System.out.println("Numero de telefono " +this.NumeroDeTelefono);
    }
}
