package TareaEnClaseAbstractFacthoryPasajes;

public class Cliente {

	public static void main(String[] args) {
		FactoryPasaje.make(FactoryPasaje.Pasajes.PasajeStandart).crear();
		FactoryPasaje.make(FactoryPasaje.Pasajes.PasajeInfantes).crear();
		FactoryPasaje.make(FactoryPasaje.Pasajes.PasajeSolidario).crear();
	}

}
