package TareaEnClaseComputadores;

public class Reinicio implements IStateComputadora {

	@Override
	public void handler(Computadora computadora) {

		System.out.println("** Estado: Se está reiniciando **");
		System.out.println("Memoria RAM antes del reinicio: " + computadora.getMemoriaRam() + "%");
		System.out.println("Consumo CPU: antes del reinicio: " + computadora.getConsumoCPU() + "%");
		computadora.setConsumoCPU(0);
		computadora.setMemoriaRam(0);
		computadora.setProgramasAbiertos(new String[100]);
		System.out.println("Memoria RAM despues del reinicio: " + computadora.getMemoriaRam() + "%");
		System.out.println("Consumo CPU despuese del reinicio: " + computadora.getConsumoCPU() + "%");

        System.out.println("La lista de programass se ha cerrado");
		System.out.println("********");
	}
}
