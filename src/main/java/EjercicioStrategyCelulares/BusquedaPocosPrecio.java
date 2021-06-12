package EjercicioStrategyCelulares;

import java.util.List;

public class BusquedaPocosPrecio implements IBusquedaPrecio {

	@Override
	public void busquedaPrecio(List<Celular> list, int precio) {
		System.out.println("Buscando entre pocos elementos según el precio: " + precio);
		for (Celular c : list) {
			if (c.getPrecio() == precio) {
				c.showInfo();
			}
		}

	}

}
