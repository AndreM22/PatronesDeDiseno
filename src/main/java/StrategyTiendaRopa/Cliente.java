package StrategyTiendaRopa;

import java.util.LinkedList;
import java.util.List;

public class Cliente {

	public static void main(String[] args) {
		TiendaDeRopa t = new TiendaDeRopa();
		
		List<Producto> lista = new LinkedList<Producto>();
		
		lista.add(new Producto("Camisa", 100));
		lista.add(new Producto("Polera", 150));
		lista.add(new Producto("Jean", 120));
		lista.add(new Producto("Chamarra", 80));
		lista.add(new Producto("Tennis", 1000));

		t.setLista(lista);
		
		t.setEstrategia(new Primavera());
		t.vender();
		
		t.setEstrategia(new Verano());
		t.vender();
		
		t.setEstrategia(new Invierno());
		t.vender();
		
		t.setEstrategia(new Otono());
		t.vender();
		
	}

}
