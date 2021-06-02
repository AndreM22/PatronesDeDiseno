package EjercicioMediatorSkype;

public class SM extends Colleague {
	String name;
	int certificaciones;

	public SM(ICanalDeComunicacion mediator) {
		super(mediator);
	}

	public SM(ICanalDeComunicacion mediator, String name, int ci, int certificaciones) {
		super(mediator);
		this.name = name;
		this.ci = ci;
		this.certificaciones = certificaciones;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public int getCertificaciones() {
		return certificaciones;
	}

	public void setCertificaciones(int certificaciones) {
		this.certificaciones = certificaciones;
	}

	@Override
	public void send(String message) {
		canalDeComunicacion.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("INFO - Message Received. Scrum Master: Nombre:" + name + " (ci: " + ci
				+ " , certificaciones:" + certificaciones + ")" + message);

	}

}
