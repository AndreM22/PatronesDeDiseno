package EjercicioProxyTarjeta;

public class Cliente {

	public static void main(String[] args) {
		VerificacionTarjeta v = new VerificacionTarjeta(100);
		
		v.comprar(101, "bolivianos");
		v.comprar(5, "euros");
		
		v.agregarFondos(15, "dolares");
		v.comprar(50, "bolivianos");

		v.agregarFondos(50, "yenes");
	}

}
