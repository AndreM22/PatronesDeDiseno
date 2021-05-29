package TareaEnClaseFactoryMethodKits;

public class Cliente {

	public static void main(String[] args) {
		CreatorKitColegial colegial = new CreatorKitColegial();
		CreatorKitEscolar escolar = new CreatorKitEscolar();
		
		KitEscolar kitEsc= (KitEscolar) escolar.create();
		kitEsc.crear();
		
		KitColegial kitCol = (KitColegial) colegial.create();
		kitCol.crear();
	}

}
