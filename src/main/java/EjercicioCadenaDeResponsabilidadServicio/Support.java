package EjercicioCadenaDeResponsabilidadServicio;

public class Support implements IEncargado {
	private IEncargado next;

	@Override
	public void setNext(IEncargado encargado) {
		this.next = encargado;
	}

	@Override
	public IEncargado next() {
		return this.next;

	}

	@Override
	public void criteriaHandler(String criterioDeResolucion) {
		System.out.println("Support: Se está evaluando el error");
	}

}
