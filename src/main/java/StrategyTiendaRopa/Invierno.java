package StrategyTiendaRopa;

import java.util.List;

public class Invierno implements IEstrategia{

	@Override
	public void vender(List<Producto> lista) {
		System.out.println("Precios invierno: ");
		System.out.println();
		for (Producto producto : lista) {
			System.out.println("Nombre del producto: "+producto.getNombre());
			System.out.println("Precio del producto: "+(producto.getPrecio()*1.1));
			System.out.println();
		}
		
	}
	
}
