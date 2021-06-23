package TareaEnClasePlataformaConBridge;

public class Cliente {

	public static void main(String[] args) {
		Arquitectura x64 = new Arquitecturax64();
		Arquitectura x86 = new Arquitecturax86();
		
		Windows w1 = new Windows(x64);
		Windows w2 = new Windows(x86);


		Linux l1 = new Linux(x64);
		Linux l2 = new Linux(x86);

		
		w1.showInfo();
		w2.showInfo();
		
		l1.showInfo();
		l2.showInfo();
		
	}

}
