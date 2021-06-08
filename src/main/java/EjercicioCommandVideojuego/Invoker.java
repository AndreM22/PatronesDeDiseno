package EjercicioCommandVideojuego;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<IAcciones> listaDeAcciones = new ArrayList<>();

	public void addCommand(IAcciones concreteCommand) {
		listaDeAcciones.add(concreteCommand);
	}

	public void executeCommands() {
		for (IAcciones command : listaDeAcciones) {
			command.execute();
		}
		listaDeAcciones.clear();
	}
}
