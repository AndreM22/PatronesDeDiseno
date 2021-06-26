package EjercicioVisitorMantenimiento;

public interface IAparato {
	public void mostrarInfo();

	public void recibirMantenimiento(IMantenimiento mantenimiento);
}
