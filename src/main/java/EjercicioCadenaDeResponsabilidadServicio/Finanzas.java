package EjercicioCadenaDeResponsabilidadServicio;

public class Finanzas implements IEncargado{
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
        if (criterioDeResolucion.equals("Costos") ){
            System.out.println("Finanzas: Se están evaluando los costos");
        } else {
            this.next.criteriaHandler(criterioDeResolucion);
        }		
	}
	

}
