package StrategyTiendaRopa;

import java.util.List;

public class Primavera implements IEstrategia{

	@Override
	public void vender(List<Producto> lista) {
		System.out.println("Precios Primavera: ");
		System.out.println();
		for (Producto producto : lista) {
			System.out.println("Nombre del producto: "+producto.getNombre());
			System.out.println("Precio del producto: "+(producto.getPrecio()));
			System.out.println();
		}
		
	}
	
}