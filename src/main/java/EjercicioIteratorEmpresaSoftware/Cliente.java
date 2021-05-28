package EjercicioIteratorEmpresaSoftware;

import java.util.HashMap;

public class Cliente {

	public static void main(String[] args) {
		HashMap<Integer, String> empleados = new HashMap<Integer, String>();
		int numeroDeEmpleado = 1;
		ListaList lista = new ListaList();
		ListaArray array = new ListaArray();
		ListaVector vector = new ListaVector();
		ListStack stack = new ListStack();

		lista.add("Antony");
		lista.add("Marcelo");
		lista.add("Pedro");
		lista.add("Domingo");
		lista.add("Axel");

		array.add("Brandon");
		array.add("Camilo");
		array.add("Esteban");
		array.add("Julian");
		array.add("Michael");

		vector.add("Sofia");
		vector.add("Abril");
		vector.add("Paola");
		vector.add("Vanessa");
		vector.add("Pamela");

		stack.add("Veronica");
		stack.add("Patricia");
		stack.add("Laura");
		stack.add("Carol");
		stack.add("Esther");

		Iterator iterator = lista.iterator();
		String empleadoActual;
		while (iterator.hasNext()) {
			empleadoActual = (String) iterator.next();
			System.out.println("Nombre empresa 1: " + empleadoActual);
			empleados.put(numeroDeEmpleado, empleadoActual);
			numeroDeEmpleado++;
		}
		iterator = array.iterator();
		while (iterator.hasNext()) {
			empleadoActual = (String) iterator.next();
			System.out.println("Nombre empresa 2: " + empleadoActual);
			empleados.put(numeroDeEmpleado, empleadoActual);
			numeroDeEmpleado++;
		}
		iterator = vector.iterator();
		while (iterator.hasNext()) {
			empleadoActual = (String) iterator.next();
			System.out.println("Nombre empresa 3: " + empleadoActual);
			empleados.put(numeroDeEmpleado, empleadoActual);
			numeroDeEmpleado++;
		}
		iterator = stack.iterator();
		while (iterator.hasNext()) {
			empleadoActual = (String) iterator.next();
			System.out.println("Nombre empresa 4: " + empleadoActual);
			empleados.put(numeroDeEmpleado, empleadoActual);
			numeroDeEmpleado++;

		}
		
		System.out.println(empleados.size()+" es el número de empleados");
	}

}
