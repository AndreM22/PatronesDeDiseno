package EjercicioCompositeComputadoras;

import java.util.ArrayList;
import java.util.List;

public class CompositeEquipo extends Equipo{
    private List<Equipo> entidadList = new ArrayList<>();


    public CompositeEquipo(String nombre) {
        super(nombre);
    }

    @Override
    public void precio() {
        Global.totalPrecio=Global.totalPrecio+this.getPrecio();
        for (Equipo entidad : entidadList) {
            entidad.precio();
            //Global.totalPrecio=Global.totalPrecio+entidad.getPrecio();
        }
        System.out.println(Global.totalPrecio);
    }

    public void showTotalPrecio(){
        System.out.println("| Precio Total: "+Global.totalPrecio+" |");
    }

    @Override
    public void add(Equipo entidad) {
        entidadList.add(entidad);
    }

    @Override
    public void remove(Equipo entidad) {
        entidadList.remove(entidad);
    }

    @Override
    public void getChild(int position) {
        //todo
    }

}
