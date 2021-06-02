package EjercicioMediatorSkype;

public class DEV extends Colleague {
	String name;
	String lenguaje;

	public DEV(ICanalDeComunicacion mediator) {
		super(mediator);
	}

	public DEV(ICanalDeComunicacion mediator, String name, int ci, String lenguaje) {
		super(mediator);
		this.name = name;
		this.ci = ci;
		this.lenguaje = lenguaje;
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

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	@Override
	public void send(String message) {
		canalDeComunicacion.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("INFO - Message Received DEV: Nombre:" + name + " (ci: " + ci + " , lenguaje:" + lenguaje
				+ ")" + message);

	}

}
