package EjercicioCadenaDeResponsabilidadMando;

public interface IEjercito {
	void setNext(IEjercito iejercito);
	IEjercito next();
	void accion (String accion);
}
