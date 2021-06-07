package EjercicioCadenaDeResponsabilidadServicio;

public class Developer implements IEncargado{
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
        if (criterioDeResolucion.equals("Nueva funcionalidad") ){
            System.out.println("Developer: Se estima la nueva funcionalidad");
        } else {
            this.next.criteriaHandler(criterioDeResolucion);
        }		
	}
	

}
