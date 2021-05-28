package EjercicioIteratorEmpresaSoftware;

import java.util.Stack;

public class ListStack implements IList {

	private Stack<String> empleados;

	public ListStack() {
		empleados = new Stack<String>();
	}

	public void add(String value) {
		empleados.add(value);
	}

	@Override
	public IteratorList iterator() {
		return new IteratorList(this.empleados);
	}
}