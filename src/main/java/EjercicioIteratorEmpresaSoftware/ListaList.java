package EjercicioIteratorEmpresaSoftware;

import java.util.LinkedList;
import java.util.List;

public class ListaList implements IList{

    private List<String> empleados;


    public ListaList(){
        empleados= new LinkedList<String>();
    }
     public void add(String value){
    	 empleados.add(value);
     }

    @Override
    public IteratorList iterator() {
        return new IteratorList(this.empleados);
    }
}