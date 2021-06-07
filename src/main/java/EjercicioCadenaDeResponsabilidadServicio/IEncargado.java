package EjercicioCadenaDeResponsabilidadServicio;

public interface IEncargado {
	void setNext(IEncargado encargado);

	IEncargado next();

	void criteriaHandler(String criterioDeResolucion);
}
