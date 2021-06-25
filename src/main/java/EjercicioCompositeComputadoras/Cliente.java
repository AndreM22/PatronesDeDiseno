package EjercicioCompositeComputadoras;

public class Cliente {

	public static void main(String[] args) {
		CompositeEquipo c1 = new CompositeEquipo("Computadora");
		CompositeEquipo c2 = new CompositeEquipo("Computadora");
		CompositeEquipo c3 = new CompositeEquipo("Computadora");

		CompositeEquipo l1 = new CompositeEquipo("Laboratorio");
		l1.add(c1);
		l1.add(c2);
		l1.add(c3);
		
		CompositeEquipo l2 = new CompositeEquipo("Laboratorio");
		l2.add(c1);
		l2.add(c2);
		l2.add(c3);
		
		CompositeEquipo l3 = new CompositeEquipo("Laboratorio");
		l3.add(c1);
		l3.add(c2);
		l3.add(c3);

		CompositeEquipo con1 = new CompositeEquipo("Contenedor");
		con1.add(l1);
		con1.add(l2);
		con1.add(l3);
		
		con1.precio();

	}

}
