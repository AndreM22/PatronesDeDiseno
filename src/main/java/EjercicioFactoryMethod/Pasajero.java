package EjercicioFactoryMethod;

public class Pasajero {
	
	private String nombre;
	private String fechaDeNacimiento;
	private int ci;
	
	public void showInfo() {
		System.out.println("Información Pasajero");
		System.out.println("Nombre: "+nombre);
		System.out.println("CI: "+ci);
		if(!(fechaDeNacimiento==null || fechaDeNacimiento.isBlank())) {
			System.out.println("Fecha de nacimiento= "+fechaDeNacimiento);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

}
