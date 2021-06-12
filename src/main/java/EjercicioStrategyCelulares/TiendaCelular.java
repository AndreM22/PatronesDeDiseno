package EjercicioStrategyCelulares;

import java.util.LinkedList;
import java.util.List;

public class TiendaCelular {
	private IBusquedaModelo bm;
	private IBusquedaPrecio bp;
	private int value;
	private List<Celular> list = new LinkedList<Celular>();

	
	public TiendaCelular(int value) {
		this.value = value;
	}

	public void add(Celular c) {
		list.add(c);
	}
	public IBusquedaModelo getBm() {
		return bm;
	}

	public void setBm(IBusquedaModelo bm) {
		this.bm = bm;
	}

	public IBusquedaPrecio getBp() {
		return bp;
	}

	public void setBp(IBusquedaPrecio bp) {
		this.bp = bp;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	public List<Celular> getList() {
		return list;
	}

	public void setList(List<Celular> list) {
		this.list = list;
	}

	public void buscarSegunPrecio(int precio) {
		if(list.size()>value) {
			bp = new BusquedaMuchosPrecio();
		}else {
			bp = new BusquedaPocosPrecio();
		}
		bp.busquedaPrecio(list, precio);
	}
	
	public void buscarSegunModelo(String modelo) {
		if(list.size()>value) {
			bm = new BusquedaMuchosModelo();
		}else {
			bm = new BusquedaPocosModelo();
		}
		bm.busquedaPrecio(list, modelo);
	}
}
