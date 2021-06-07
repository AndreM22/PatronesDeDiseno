package EjercicioCadenaDeResponsabilidadServicio;

public class Cliente {
	public static void main(String[] args) {
		HandlerManager hm = new HandlerManager();
		hm.criteriaHandler("Bug");
		System.out.println("************");
		hm.criteriaHandler("Mejora");
		System.out.println("************");
		hm.criteriaHandler("Nueva funcionalidad");
		System.out.println("************");
		hm.criteriaHandler("Infraestructura");
		System.out.println("************");
		hm.criteriaHandler("Costos");
		System.out.println("************");
		hm.criteriaHandler("Ataque cibernético");
		System.out.println("************");
	}
}
