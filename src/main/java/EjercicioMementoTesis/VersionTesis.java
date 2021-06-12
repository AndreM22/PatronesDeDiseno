package EjercicioMementoTesis;

public class VersionTesis {
	private Tesis state;
	
	public VersionTesis(Tesis state) {
		this.state=state;
	}
	
	public Tesis getState() {
		return state;
	}
}
