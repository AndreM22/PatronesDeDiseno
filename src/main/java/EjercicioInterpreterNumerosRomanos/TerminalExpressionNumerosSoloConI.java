package EjercicioInterpreterNumerosRomanos;

public class TerminalExpressionNumerosSoloConI extends AbstractExpression {


	@Override
	public void interpreter(ContextNumero context) {
		int repeticionesDeI = Integer.parseInt(context.input.substring(0, 1));
		for (int i = 0; i < repeticionesDeI; i++) {
			context.output = context.output + "I";
		}
		context.output = context.output + " ";
		context.input = context.input.substring(1);
	}
}
