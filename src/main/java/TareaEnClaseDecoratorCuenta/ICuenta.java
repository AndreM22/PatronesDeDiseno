package TareaEnClaseDecoratorCuenta;

public interface ICuenta {
	public int monto();
	public void agregarFondos(int cantidad);
	public void quitarFondos(int cantidad);
	public String nombrePropietario();
	public void informacionCuenta();
}
