package EjercicioIteratorEmpresaSoftware;


public class ListaArray implements IList{

    private String [] empleados;
    private int position;

    public ListaArray(){
        position=0;
        empleados= new String[5];
    }
     public void add(String value){
    	 empleados[position]=value;
        position++;
     }

    @Override
    public IteratorArray iterator() {
        return new IteratorArray(this.empleados);
    }
}