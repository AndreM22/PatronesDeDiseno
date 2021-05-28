package EjercicioIteratorEmpresaSoftware;

import java.util.Vector;


public class ListaVector implements IList{
    private Vector<String> empleados;

    public ListaVector(){
    	empleados= new Vector<>();
    }
     public void add(String value){
    	 empleados.add(value);
     }

    @Override
    public IteratorVector iterator() {
        return new IteratorVector(this.empleados);
    }
}
