package EjercicioCompositeArchivo;

public class Cliente {

	public static void main(String[] args) {
		Documento a1 = new Archivo("a b c");
		Documento a2 = new Archivo("d e f");
		Documento a3 = new Archivo("g h i");
		
		a1.MostrarPalabras();
		
		Documento a4 = new Archivo("j k");
		Documento a5 = new Archivo("l m");
		Documento a6 = new Archivo("n o ");
		
		a4.MostrarPalabras();
		
		Documento folder1 = new ContenedorDeArchivos();
		
		folder1.add(a1);
		folder1.add(a2);
		folder1.add(a3);

		folder1.MostrarPalabras();
		
		Documento folder2 = new ContenedorDeArchivos();
		
		folder2.add(a4);
		folder2.add(a5);
		folder2.add(a6);

		folder2.MostrarPalabras();
		
		Documento unidadDisco = new ContenedorDeArchivos();
		
		unidadDisco.add(folder1);
		unidadDisco.add(folder2);
		
		unidadDisco.MostrarPalabras();
	}

}
