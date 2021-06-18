package EjercicioAdapterArtefactos;

public class ElectronicoGrandeAdaptado implements IElectronicosPequenos{
	IElectronicosGrandes electricoGrande;

	
	public ElectronicoGrandeAdaptado(IElectronicosGrandes electricoGrande) {
		this.electricoGrande = electricoGrande;
	}

	@Override
	public void precio() {
		System.out.println("Adaptando el costo a precio:");
		electricoGrande.costo();
		
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("El tiempo de garantía es igual al tiempo de vida del siguiente producto");
		electricoGrande.tiempoDeGarantia();
	}

}
