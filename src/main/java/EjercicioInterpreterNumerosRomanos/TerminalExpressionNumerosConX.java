package EjercicioInterpreterNumerosRomanos;

public class TerminalExpressionNumerosConX extends AbstractExpression {

	@Override
	public void interpreter(ContextNumero context) {
		int numero = Integer.parseInt(context.input.substring(0, 1));
		if (numero == 9) {
			context.output = context.output + "IX";
		} else {
			context.input = context.input.substring(1);
			context.output = context.output + "X";

		}
		context.output = context.output + " ";
		context.input = context.input.substring(1);
	}
}
