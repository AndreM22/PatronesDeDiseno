package TareaEnClaseComputadores;

public class Apagado implements IStateComputadora {

	public Apagado() {

	}

	@Override
	public void handler(Computadora computadora) {
		System.out.println("** Estado: Apagado **");
		computadora.setConsumoCPU(0);
		computadora.setMemoriaRam(0);
		computadora.setProgramasAbiertos(new String[100]);

		System.out.println("Memoria RAM: " + computadora.getMemoriaRam() + "%");
		System.out.println("Consumo CPU: " + computadora.getConsumoCPU() + "%");
		System.out.println("La lista de programass abiertos está vacia");
		System.out.println("********");
	}
}
