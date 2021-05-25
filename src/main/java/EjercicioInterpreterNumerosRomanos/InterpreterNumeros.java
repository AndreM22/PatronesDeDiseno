package EjercicioInterpreterNumerosRomanos;

import java.util.ArrayList;
import java.util.List;


public class InterpreterNumeros extends AbstractExpression {

	private List<AbstractExpression> parseTree = new ArrayList<>();
	private ContextNumero context;

	public InterpreterNumeros(String word) {
		this.interpretecion(word);
	}

	public void interpretecion(String words) {
		String input = words;
		context = new ContextNumero(input.replace(" ", ""));
		for (String word : input.split(" ")) {
			int numero = Integer.parseInt(word);
			if (numero <= 3) {
				parseTree.add(new TerminalExpressionNumerosSoloConI());
			} else if (numero <= 8) {
				parseTree.add(new TerminalExpressionNumerosConV());
			} else if (numero <= 10) {
				parseTree.add(new TerminalExpressionNumerosConX());
			}

		}
	}

	public String interpretar() {
		for (AbstractExpression terminalExpresion : parseTree) {
			terminalExpresion.interpreter(context);
		}
		return context.output;
	}

	@Override
	public void interpreter(ContextNumero context) {
		// TODO Auto-generated method stub

	}

}
