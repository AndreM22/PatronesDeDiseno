package EjercicioCadenaDeResponsabilidadServicio;


public class DevOp implements IEncargado{
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
        if (criterioDeResolucion.equals("Infraestructura") ){
            System.out.println("DevOp: Se requiere información del error");
        } else {
            this.next.criteriaHandler(criterioDeResolucion);
        }		
	}
	

}
