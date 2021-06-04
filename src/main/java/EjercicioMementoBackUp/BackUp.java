package EjercicioMementoBackUp;

import java.util.LinkedList;
import java.util.List;

public class BackUp {
	String backUp;
	List<Persona> baseDeDatos;
	
	public BackUp() {
		baseDeDatos=new LinkedList<Persona>();
	}
	public BackUp(String name, List baseDeDatos) {
		this.backUp=name;
		this.baseDeDatos=baseDeDatos;
	}
	public String getBackUp() {
		return backUp;
	}

	public void setBackUp(String backUp) {
		this.backUp = backUp;
	}

	public List<Persona> getBaseDeDatos() {
		return baseDeDatos;
	}

	public void setBaseDeDatos(List<Persona> baseDeDatos) {
		this.baseDeDatos = baseDeDatos;
	}
	
	public void mostrarInfo() {
		System.out.println("Alias: "+backUp);
		for(Persona p: baseDeDatos) {
			p.mostrarInfo();
			System.out.println();
		}
	}

}
