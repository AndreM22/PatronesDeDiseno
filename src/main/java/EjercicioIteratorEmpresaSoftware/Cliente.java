package EjercicioIteratorEmpresaSoftware;


public class Cliente {

	public static void main(String[] args) {
		ListaList lista = new ListaList();
		ListaArray array = new ListaArray();
		ListaVector vector= new ListaVector();
		ListStack stack = new ListStack();
		
		lista.add("Antony");
		lista.add("Marcelo");
		lista.add("Pedro");
		lista.add("Domingo");
		lista.add("Axel");

		array.add("Brandon");
		array.add("Camilo");
		array.add("Esteban");
		array.add("Julian");
		array.add("Michael");

		vector.add("Sofia");
		vector.add("Abril");
		vector.add("Paola");
		vector.add("Vanessa");
		vector.add("Pamela");

		stack.add("Veronica");
		stack.add("Patricia");
		stack.add("Laura");
		stack.add("Carol");
		stack.add("Esther");

        Iterator iterator = lista.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre empresa 1: "+iterator.next());
        } 
        iterator = array.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre empresa 2: "+iterator.next());
        } 
        iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre empresa 3: "+iterator.next());
        } 
        iterator = stack.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre empresa 4: "+iterator.next());
        } 
	}

}
