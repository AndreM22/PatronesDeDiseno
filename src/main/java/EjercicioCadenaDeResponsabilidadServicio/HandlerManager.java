package EjercicioCadenaDeResponsabilidadServicio;

public class HandlerManager implements IEncargado {
    private  IEncargado next;

    @Override
    public void setNext(IEncargado handler) {
        this.next=handler;
    }

    @Override
    public IEncargado next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(String criterioDeResolucion) {

    	DevOp devOp = new DevOp();
    	this.setNext(devOp);
    	
    	QA qa = new QA();
    	devOp.setNext(qa);
    	
    	Developer dev = new Developer();
    	qa.setNext(dev);
    	
    	Finanzas fin = new Finanzas();
    	dev.setNext(fin);
    	
    	Support sup = new Support();
    	fin.setNext(sup);

          this.next.criteriaHandler(criterioDeResolucion);
    }
}
