package EjercicioMementoBackUp;

public class Persona {
	String name;
	int ci;
	int edad;

	public Persona(String name, int ci, int edad) {
		this.name = name;
		this.ci = ci;
		this.edad = edad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void mostrarInfo() {
		System.out.println("Nombre: " + name);
		System.out.println("Ci: " + ci);
		System.out.println("Edad: " + edad);
	}
}
