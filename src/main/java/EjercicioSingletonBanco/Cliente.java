package EjercicioSingletonBanco;

public class Cliente {
	public static void main(String[] args) {
		CasaDeCambio casaDeCambio = new CasaDeCambio();
		Banco banco = new Banco();
		LibreCambistas libreCambistas = new LibreCambistas();
		
		banco.BolivianosAEuros(12.2);
		casaDeCambio.BolivianosADolares(234);
		casaDeCambio.DolaresAEuros(22.1);
		libreCambistas.EurosADolares(132222);
		libreCambistas.EurosABolivianos(113.10);
		casaDeCambio.BolivianosADolares(21233.4);
		banco.DolaresABolivianos(33.9);
	}
	
}
