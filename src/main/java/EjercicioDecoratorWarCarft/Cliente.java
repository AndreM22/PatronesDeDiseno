package EjercicioDecoratorWarCarft;

public class Cliente {

	public static void main(String[] args) {
		IPersonaje war = new Personaje("Leoric");
		war.info();
		
		war = new ArmarPersonaje(war, "Hacha");
		war.info();
		
		war = new AgregarEscudo(war);
		war.info();
		
		war = new AgregarPocion(war);
		war.info();

		
	}

}
