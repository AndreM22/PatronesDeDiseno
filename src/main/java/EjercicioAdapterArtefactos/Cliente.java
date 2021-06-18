package EjercicioAdapterArtefactos;

public class Cliente {
	public static void main(String[] args) {
		IElectronicosPequenos celular = new Celular("Samsung Galaxy", 100, "3 a�os");
		IElectronicosPequenos tableta = new Tableta("LG Tablet", 500, "4 a�os");
		IElectronicosPequenos computadora = new Computadora("Hp intel", 1000, "5 a�os");
		IElectronicosPequenos televisor = new ElectronicoGrandeAdaptado(new Televisor("Sony", 1500, "1 a�o"));
		IElectronicosPequenos refrigerador = new ElectronicoGrandeAdaptado(new Refrigerador("Frezeex", 5000, "3 a�os"));
		IElectronicosPequenos lavadora = new ElectronicoGrandeAdaptado(new Lavadora("LG lavator", 3500, "2 a�os"));

		celular.precio();
		tableta.precio();
		computadora.precio();
		televisor.precio();
		refrigerador.precio();
		lavadora.precio();

		celular.tiempoDeVida();
		tableta.tiempoDeVida();
		computadora.tiempoDeVida();
		televisor.tiempoDeVida();
		refrigerador.tiempoDeVida();
		lavadora.tiempoDeVida();
	}
}
