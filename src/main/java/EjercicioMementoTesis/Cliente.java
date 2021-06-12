package EjercicioMementoTesis;


public class Cliente {
	public static void main(String[] args) {
		Versiones versiones = new Versiones();
		Originator originator = new Originator();

		Tesis t;
		t = new Tesis("12/1/2000", "adasdasfd");
		originator.setState(t);
		versiones.addMemento(originator.createVersion());
		
		t = new Tesis("12/2/2000", "iupopuiouipui");
		originator.setState(t);
		versiones.addMemento(originator.createVersion());
		
		t = new Tesis("12/3/2000", "mnbmbnmbnmnm");
		originator.setState(t);
		versiones.addMemento(originator.createVersion());
		
		t = new Tesis("12/4/2000", "xdfvvfdxxdfv");
		originator.setState(t);
		versiones.addMemento(originator.createVersion());
		
		t = new Tesis("12/5/2000", "yhhthhgyhtfhtf");
		originator.setState(t);
		versiones.addMemento(originator.createVersion());
		
		originator.restoreFromMemento(versiones.getVersion(2));
		
	}
}
