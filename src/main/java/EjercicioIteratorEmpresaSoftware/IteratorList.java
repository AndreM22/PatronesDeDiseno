package EjercicioIteratorEmpresaSoftware;

import java.util.List;

public class IteratorList implements Iterator{

    private List<String> empleados;
    private int position;

    public IteratorList(List<String> empleados){
        this.empleados=empleados;
        this.position=0;
    }

    @Override
    public Object next() {
        return empleados.get(position++);
    }

    @Override
    public boolean hasNext() {
        return empleados.size() != 0 && position < empleados.size() ;
    }
}
