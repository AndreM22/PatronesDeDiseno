package TareaEnClasePlataformaConBridge;

public class Windows extends Plataforma{
	public Windows(Arquitectura arquitectura) {
		super(arquitectura);
	}
	public void showInfo() {
		System.out.println("windows");
		this.arquitectura.showInfo();
	}
}
