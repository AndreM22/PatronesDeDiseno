package EjercicioInterpreterNumerosRomanos;

public class TerminalExpressionNumerosConV extends AbstractExpression {

	@Override
	public void interpreter(ContextNumero context) {
		int numero = Integer.parseInt(context.input.substring(0, 1));
		if (numero == 4) {
			context.output = context.output + "IV";
		} else {
			context.output = context.output + "V";
			for (int i = 0; i < numero - 5; i++) {
				context.output = context.output + "I";
			}
		}
		context.output = context.output + " ";
		context.input = context.input.substring(1);
	}
}
