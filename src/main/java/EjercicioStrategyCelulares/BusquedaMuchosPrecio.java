package EjercicioStrategyCelulares;

import java.util.List;

public class BusquedaMuchosPrecio implements IBusquedaPrecio {

	@Override
	public void busquedaPrecio(List<Celular> list, int precio) {
		System.out.println("Buscando entre varios elementos según el precio: "+precio);
		for (Celular c : list) {
			if (c.getPrecio() == precio) {
				c.showInfo();
			}
		}

	}

}
