package EjercicioMediatorSkype;

public class QA extends Colleague {
	String name;
	String grado;

	public QA(ICanalDeComunicacion mediator) {
		super(mediator);
	}

	public QA(ICanalDeComunicacion mediator, String name, int ci, String grado) {
		super(mediator);
		this.name = name;
		this.ci = ci;
		this.grado = grado;
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

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	@Override
	public void send(String message) {
		canalDeComunicacion.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println(
				"INFO - Message Received. QA: Nombre:" + name + " (ci: " + ci + " , grado:" + grado + ")" + message);

	}

}
