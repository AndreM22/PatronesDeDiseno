package EjercicioInterpreterNumerosRomanos;

public class Cliente {

	public static void main(String[] args) {

		String entrada = "1 2 3 4 5 6 7 8 9 10";

		InterpreterNumeros interpreterOperaciones = new InterpreterNumeros(entrada);
		System.out.println("Entrada: " + entrada);
		System.out.println("Resultado: " + interpreterOperaciones.interpretar());
		
		String entrada2 = "4 5 2 9 10 5 2";

		InterpreterNumeros interpreterOperaciones2 = new InterpreterNumeros(entrada2);
		System.out.println("Entrada: " + entrada2);
		System.out.println("Resultado: " + interpreterOperaciones2.interpretar());
	}
}
