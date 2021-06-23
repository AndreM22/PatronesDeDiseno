package TareaEnClasePlataformaConBridge;

public class Linux extends Plataforma{
	public Linux(Arquitectura arquitectura) {
		super(arquitectura);
	}
	public void showInfo() {
		System.out.println("Linux");
		this.arquitectura.showInfo();
	}
}
