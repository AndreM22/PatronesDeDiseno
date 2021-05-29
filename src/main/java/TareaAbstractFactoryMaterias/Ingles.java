package TareaAbstractFactoryMaterias;

public class Ingles extends IMateria {
	String profesor;
	int horasRequeridas;
	int creditos;

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public int getHorasRequeridas() {
		return horasRequeridas;
	}

	public void setHorasRequeridas(int horasRequeridas) {
		this.horasRequeridas = horasRequeridas;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	@Override
	public void crear() {
		System.out.println("Ingles");
		System.out.println("Profesor: " + profesor);
		System.out.println("Horas requeridas: " + horasRequeridas);
		System.out.println("Creditos: " + creditos);

	}
}