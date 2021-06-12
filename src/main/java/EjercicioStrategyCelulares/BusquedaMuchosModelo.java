package EjercicioStrategyCelulares;

import java.util.List;

public class BusquedaMuchosModelo implements IBusquedaModelo {

	@Override
	public void busquedaPrecio(List<Celular> list, String modelo) {
		System.out.println("Buscando entre varios elementos según el modelo: "+modelo);
		for (Celular c : list) {
			if (c.getModelo().equals(modelo)) {
				c.showInfo();
			}
		}

	}

}