package EjercicioIteratorEmpresaSoftware;

public class IteratorArray implements Iterator {

	private String[] empleados;
	private int position;

	public IteratorArray(String[] empleados) {
		this.empleados = empleados;
		this.position = 0;

	}

	@Override
	public Object next() {
		return empleados[position++];
	}

	@Override
	public boolean hasNext() {
		return empleados.length != 0 && position < empleados.length;
	}
}
