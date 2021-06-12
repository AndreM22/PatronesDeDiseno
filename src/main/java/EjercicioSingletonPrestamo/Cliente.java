package EjercicioSingletonPrestamo;

public class Cliente {
	public static void main(String[] args) {
		Pagos p = new Pagos();
		Banco.getInstance().setPrestamoInicial(1000);
		p.pagar(100, 1000);
		p.pagar(100, 1000);
		p.pagar(100, 1000);
		p.pagar(100, 1000);
		p.pagar(100, 1000);
		p.pagar(100, 1000);
		p.pagar(100, 1000);
		p.pagar(100, 1000);
		p.pagar(100, 1000);
		p.pagar(100, 1000);
		p.pagar(100, 1000);

	}
}
