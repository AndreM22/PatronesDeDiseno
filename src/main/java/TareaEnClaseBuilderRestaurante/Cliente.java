package TareaEnClaseBuilderRestaurante;

public class Cliente {
	public static void main(String[] args) {
		Restaurante restaurante = new Restaurante();
		Lomito lomito= new Lomito();
		Tira tira = new Tira();
		Bife bife = new Bife();
		
		System.out.println("Bife:");
		restaurante.setBuilderParrilla(bife);
		restaurante.cocinarParrilla();
		restaurante.getParrilla().showData();
		
		System.out.println("Tira");
		restaurante.setBuilderParrilla(tira);
		restaurante.cocinarParrilla();
		restaurante.getParrilla().showData();
		
		System.out.println("Lomito");
		restaurante.setBuilderParrilla(lomito);
		restaurante.cocinarParrilla();
		restaurante.getParrilla().showData();
	}
}
