package EjercicioCadenaDeResponsabilidadServicio;

public class QA implements IEncargado{
    private  IEncargado next;

	@Override
	public void setNext(IEncargado encargado) {
        this.next=encargado;		
	}

	@Override
	public IEncargado next() {
        return this.next;

	}

	@Override
	public void criteriaHandler(String criterioDeResolucion) {
        if (criterioDeResolucion.equals("Bug") ||  criterioDeResolucion.equals("Mejora")){
            System.out.println("QA: El error se esta Aislando");
        } else {
            this.next.criteriaHandler(criterioDeResolucion);
        }		
	}
	

}
